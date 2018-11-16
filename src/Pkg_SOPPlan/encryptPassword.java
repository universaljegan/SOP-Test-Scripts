package Pkg_SOPPlan;

import java.nio.charset.StandardCharsets;
import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class encryptPassword {

	public static void main(String[] args) {
		// Enter your original password here, once you received the Encrypted password, remove your original password
		generatePassword("Alpha@123");		
	}
	
	public static void generatePassword(String orginalPassword)
	{
		try
		{
			String key = "Bar12345Bar12345";
			//Create key and cipher
			Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES");
			
			//Encrypt the text
			cipher.init(Cipher.ENCRYPT_MODE, aesKey);
			byte[] encrypted = cipher.doFinal(orginalPassword.getBytes(StandardCharsets.UTF_8));
//			
//			int i = 0;
//			String [] strings = orginalPassword.substring(1, orginalPassword.length()-1).split(",");
//			for (String s : strings) encrypted[i++] = Byte.parseByte(s);
			System.out.println(new String(encrypted, "UTF-8"));
			
			StringBuilder sb = new StringBuilder();
            for (byte b: encrypted) 
            {
                sb.append((char)b);
                //System.out.println((char)b);
            }

            // the encrypted String
            String enc = sb.toString();
            
			System.out.println("Your encrypted password is: " + new String(enc));	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
