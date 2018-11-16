package Pkg_SOPPlan;

import org.openqa.selenium.*;
import Pkg_SOPPlan.commonLibrary;

public class objectRepository 
{	
	private static WebElement element = null;
	
	//SOPPlan OWNER
	//Move to System Owner Function Menu
	public static WebElement sow_system_owner_menu(WebDriver driver)
    {
       element = driver.findElement(By.xpath(".//*[@id='ctl00_miSystemOwner']/a"));
       return element;
    }

	//User Management Menu
	public static WebElement sow_menu_user_management(WebDriver driver)
    {
       element = driver.findElement(By.id("menuItemHilite0"));
       return element;
    }

	//Client Company Status Link
	public static WebElement sow_client_company_status(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_imgToggle1"));
       return element;
    }
	
	
	//Header
	//Display name after login
	public static WebElement hdp_header_display_name(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_hlkUsername"));
       return element;
    }
	
	//Change Password Link
	public static WebElement hdp_change_password(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_hlkChangePwd"));
       return element;
    }
	
	//Current Password Textbox
	public static WebElement hdp_current_password(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_txtPassword"));
       return element;
    }
	
	//New Password Textbox
	public static WebElement hdp_new_password(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_txtNewPassword"));
       return element;
    }
	
	//Confirm Password Textbox
	public static WebElement hdp_confirm_password(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_txtConfirmPassword"));
       return element;
    }
	
	//Confirm Password Validate
	public static WebElement hdp_confirm_password_validation(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_CompareValidator1"));
       return element;
    }
	
	
	
	//Save Password Button
	public static WebElement hdp_save_password(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_imgsave"));
       return element;
    }
	
	//Logout Link
	public static WebElement hdp_logout(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_hlkLogin"));
       return element;
    }
	
	//Landing Page Image
	public static WebElement hdp_landing_page(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_imgIELogo"));
       return element;
    }
	
	//Register for free trial objects
	
	//Register free trial link
	public static WebElement rfc_register_free_trial(WebDriver driver)
    {
       element = driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/div/a[1]"));
       return element;
    }
    
	//EMail id
	public static WebElement rfc_email(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_txtEmail"));
       return element;
    }
	
    //EMail id validator message
  	public static WebElement rfc_email_validator(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_RegularExpressionValidator1"));
       return element;
    }
	
	//Confirmation EMail id
	public static WebElement rfc_confirm_email(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_txtcfmMail"));
       return element;
    }

    //Confirm EMail id validator message
  	public static WebElement rfc_confirm_email_validator(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_CompareValidator2"));
       return element;
    }
  	
	//First Name
	public static WebElement rfc_first_name(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_txtFirstName"));
       return element;
    }

    //First name validator message
  	public static WebElement rfc_first_name_validator(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_RequiredFieldValidator2"));
       return element;
    }
	
	//Last Name
	public static WebElement rfc_last_name(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_txtLastName"));
       return element;
    }

    //Last name validator message
  	public static WebElement rfc_last_name_validator(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_RequiredFieldValidator4"));
       return element;
    }
	
	//Company Name
	public static WebElement rfc_company_name(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_txtCompanyName"));
       return element;
    }

    //Company name validator message
  	public static WebElement rfc_company_name_validator(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_RequiredFieldValidator11"));
       return element;
    }
	
	//Continue button
	public static WebElement rfc_continue(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_Imglkfreetrial"));
       return element;
    }
	
	//Page 2
	
	//Check page 2 opens
	public static WebElement rfc_check_page_2_opens(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_Imglkfreetrial"));
       return element;
    }
	//Country
	public static WebElement rfc_country(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_ddlCountry"));
       return element;
    }
	
	//Country Empty validator
	public static WebElement rfc_country_empty_validator(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_RequiredFieldValidator6"));
       return element;
    }
		
	//Password
	public static WebElement rfc_password(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_txtPassword"));
       return element;
    }
	
	//Password
	public static WebElement rfc_password_empty_validator(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentPlaceHolder_RequiredFieldValidator5"));
	   return element;
	}
	
	//Password
	public static WebElement rfc_password_length_validator(WebDriver driver)
	{
		element = driver.findElement(By.id("ctl00_ContentPlaceHolder_regularExpr1"));
		return element;
	}
	
	//Password
	public static WebElement rfc_password_spl_character_validator(WebDriver driver)
	{
		element = driver.findElement(By.id("ctl00_ContentPlaceHolder_RequiredFieldValidator5"));
		return element;
	}
	
	//Confirm Password
	public static WebElement rfc_confirm_password(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_txtConfirmPassword"));
       return element;
    }
	
	//Confirm Password Validator
	public static WebElement rfc_confirm_password_validator(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_CompareValidator1"));
       return element;
    }
	
	//Security Question
	public static WebElement rfc_security_question(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_ddlSecurityQues"));
       return element;
    }
	
	//Security Answer
	public static WebElement rfc_security_answer(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_txtSecurityAns"));
       return element;
    }
	
	//Security Answer Empty Validator
	public static WebElement rfc_security_answer_empty_validator(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_RequiredFieldValidator10"));
       return element;
    }
	
	//Accept Terms
	public static WebElement rfc_accept_terms(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_chkAgree"));
       return element;
    }
	
	//Terms of use
	public static WebElement rfc_terms_of_use(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_lnkTermsOfUse"));
       return element;
    }
	
	//Begin free trial
	public static WebElement rfc_begin_free_trial(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_Imglkfreetrial"));
       return element;
    }
	
	// ************************ Account Activation *********************************
	//Click on GMail
	public static WebElement aac_gmail_link(WebDriver driver)
    {
       element = driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a"));
       return element;
    }
	
	//GMail - Sometime shows this page, need to click again "Sign In"
	public static WebElement aac_signin_link(WebDriver driver)
    {
       element = driver.findElement(By.xpath("html/body/nav/div/a[2]"));
       return element;
    }
	
	//Enter EMail Id
	public static WebElement aac_gmail_id(WebDriver driver)
    {
       element = driver.findElement(By.id("identifierId"));
       return element;
    }
	
	//Enter EMail Id
	public static WebElement aac_gmail_next(WebDriver driver)
    {
       element = driver.findElement(By.id("identifierNext"));
       return element;
    }
	
	//Enter Password
	public static WebElement aac_gmail_password(WebDriver driver)
    {
       element = driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input"));
       return element;
    }
	
	//GMail Sign In
	public static WebElement aac_sign_in(WebDriver driver)
    {
       element = driver.findElement(By.id("passwordNext"));
       return element;
    }
	
	//Click on MySOPlan email
	public static WebElement aac_open_activation_mail(WebDriver driver)
    {
       element = driver.findElement(By.xpath("//div [@class='y6']/span[contains(.,'Welcome to mysopplan.com')]"));
       return element;
    }
	
	//Click Activation Link 
	public static WebElement aac_click_activation_link(WebDriver driver)
    {
       element = driver.findElement(By.xpath("//div[1]/table/tbody/tr/td/a[3]"));
       return element;
    }
	
	//Activating User, from Manage users
	//Click on the New sales forecasting system email
	public static WebElement aac_open_new_forecasting_system_mail(WebDriver driver)
    {
       element = driver.findElement(By.xpath("//div [@class='y6']/span[contains(.,'Sales forecasting system')]"));
       return element;
    }
	
	//Click Activation Link 
	public static WebElement aac_activation_link_new_forecasting_system(WebDriver driver)
    {
       element = driver.findElement(By.xpath("//div[1]/table/tbody/tr/td/a[contains(.,'http://www.so-plan.info/UserActivation.aspx')]"));
//       element = driver.findElement(By.xpath(".//*[@id=':ju']/div[1]/table/tbody/tr/td/a[3]"));
       return element;
    }
	
	//Click on the Removal mail, after user deleted
	public static WebElement aac_check_user_removal_mail(WebDriver driver)
    {
       element = driver.findElement(By.xpath("//div [@class='y6']/span[contains(.,'Removal as a user of mySOPPLAN.com')]"));
       return element;
    }
	
	//Click on the Reset password email
	public static WebElement aac_reset_password_mail(WebDriver driver)
    {
       element = driver.findElement(By.xpath("//div [@class='y6']/span[contains(.,'Reset password')]"));
       return element;
    }
	
	//More link in GMail
	public static WebElement aac_more_link_in_mail(WebDriver driver)
    {
       element = driver.findElement(By.xpath("//span[@class='J-Ke n4 ah9']/span[@class='CJ']"));
       return element;
    }
	
	//Click on the Removal mail, after user deleted
	public static WebElement common_mail_link_identifier(WebDriver driver)
    {
		String linkText = commonLibrary.LinkText;
        element = driver.findElement(By.partialLinkText(linkText));
        return element;
    }
	
	public static WebElement aac_validate_display_name(WebDriver driver)
    {
       element = driver.findElement(By.id("lblUserDisplayName"));
       return element;
    }
	
	public static WebElement aac_download_setup_guide(WebDriver driver)
    {
       element = driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr/td/div[2]/div[2]/div[1]/div/a"));
       return element;
    }
	
	public static WebElement aac_start_setting_up_your_system(WebDriver driver)
    {
       element = driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr/td/div[2]/div[2]/div[2]/div/a"));
       return element;
    }
	
	public static WebElement aac_instruct_us_to_set_up_your_system(WebDriver driver)
    {
       element = driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr/td/div[2]/div[2]/div[3]/div/a"));
       return element;
    }
	
	//Instruct us to set up your system, send email popup
	public static WebElement aac_contact_full_name(WebDriver driver)
    {
       element = driver.findElement(By.id("txtFullname"));
       return element;
    }
	public static WebElement aac_contact_email(WebDriver driver)
    {
       element = driver.findElement(By.id("txtEMail"));
       return element;
    }
	public static WebElement aac_contact_number(WebDriver driver)
    {
       element = driver.findElement(By.id("txtContactNumber"));
       return element;
    }
	public static WebElement aac_contact_message(WebDriver driver)
    {
       element = driver.findElement(By.id("txtMessage"));
       return element;
    }
	public static WebElement aac_send_mail(WebDriver driver)
    {
       element = driver.findElement(By.id("btnSendMail"));
       return element;
    }
	
	//***************************************** Login ********************************************
	
	//Click Login in Landing Page
	public static WebElement lgi_login_link(WebDriver driver)
    {
       element = driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/div/a[2]"));
       return element;
    }
	
	//Enter Username
	public static WebElement lgi_sop_username(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_txtUsername"));
       return element;
    }
	
	//Enter Password - Textbox
	public static WebElement lgi_sop_password(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_txtPassword"));
       return element;
    }
	
	//Login - button
	public static WebElement lgi_login_button(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin"));
       return element;
    }
	
	//Forget Password - Link
	public static WebElement lgi_forget_password(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_hlkUsername"));
       return element;
    }
	
	//Forget Password EMail - Textbox
	public static WebElement lgi_forget_password_email_1(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_txtUserName"));
       return element;
    }
	
	//Forget Password EMail - Textbox
	public static WebElement lgi_forget_password_email_2(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_txtUserName"));
       return element;
    }

	//Forget Password Next Step - Button
	public static WebElement lgi_forget_password_next_step(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_Imglknxtstep"));
       return element;
    }
	
	//Forget Password Security Answer - Textbox
	public static WebElement lgi_security_answer_1(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_txtAns"));
       return element;
    }

	//Forget Password Security Answer - Textbox
	public static WebElement lgi_security_answer_2(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_txtAns"));
       return element;
    }
	
	//Security Answer Next Step - Button
	public static WebElement lgi_security_answer_next_step(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder_Imglksecnext"));
       return element;
    }
	
	//Captcha 
	public static WebElement lgi_captcha_box(WebDriver driver)
    {
       element = driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
       return element;
    }
	
	
	
	// ******************************** Test Currency symbol in "Manage Company Information" 
	//Move to Administrator "Manage Company Information"
	public static WebElement mci_administrator_menu(WebDriver driver)
    {
       element = driver.findElement(By.xpath(".//*[@id='ctl00_miAdministrator']/a"));
       return element;
    }
		
	//Click Menu "Manage Company Information"
	public static WebElement mci_manage_company_info_menu(WebDriver driver)
    {
       element = driver.findElement(By.id("menuItemHilite20"));
       return element;
    }
	
	//Company name
	public static WebElement mci_company_name(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_txtCompanyName"));
	   return element;
	}

	//Industry
	public static WebElement mci_industry(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_txtIndustry"));
	   return element;
	}

	//Country
	public static WebElement mci_country(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_txtCountry"));
	   return element;
	}

	//Currency
	public static WebElement mci_currency(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_txtCurrency"));
	   return element;
	}

	//Show Admin details button
	public static WebElement mci_manage_administrator(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_ImglkBtnMngAdmin"));
	   return element;
	}

	//Admin first name
	public static WebElement mci_admin_first_name(WebDriver driver)
	{
//	   element = driver.findElement(By.id("ctl00_ContentMenu_txtFirstName"));
		element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_gvMngAdmin']/tbody/tr[2]/td[2]"));
		return element;
	}

	//Admin last name
	public static WebElement mci_admin_last_name(WebDriver driver)
	{
//	   element = driver.findElement(By.id("ctl00_ContentMenu_txtLastName"));
		element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_gvMngAdmin']/tbody/tr[2]/td[3]"));
		return element;
	}

	//Admin display name
	public static WebElement mci_admin_display_name(WebDriver driver)
	{
	   element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_gvMngAdmin']/tbody/tr[2]/td[4]"));
	   return element;
	}

	//Admin email
	public static WebElement mci_admin_email(WebDriver driver)
	{
	   //element = driver.findElement(By.id("ctl00_ContentMenu_txtEmail"));
		element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_gvMngAdmin']/tbody/tr[2]/td[1]"));
		return element;
	}

	//Admin display name Help
	public static WebElement mci_admin_display_name_help(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_imgHelp1"));
	   return element;
	}

	//Decimal value
	public static WebElement mci_decimal_value(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_txtDecimal"));
	   return element;
	}

	//Company Time Zone
	public static WebElement mci_company_timezone(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_ddlTimeZone"));
	   return element;
	}

	//Period Monthly/Weekly
	public static WebElement mci_period(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_ddlPeriods"));
	   return element;
	}

	//Sales volume indicator
	public static WebElement mci_sales_volume_indicator(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_txtSalesVolIndicator"));
	   return element;
	}
	
	//Click "What is this?" under "Sales volume indicator"
	public static WebElement mci_what_is_this(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_lnkWhatIsThis"));
       return element;
    }
	
	//Validate the text in New window Sales Volume Indicator
	public static WebElement mci_new_window_sales_volume_indicator(WebDriver driver)
    {
       element = driver.findElement(By.id("lblHelpTipName"));
       return element;
    }
	
	//Click "Conversion Factor" in "Sales volume indicator" new window
	public static WebElement mci_conversion_factor(WebDriver driver)
    {
       element = driver.findElement(By.xpath(".//*[@id='lblHelpTipContent']/a"));
       return element;
    }
	
	//Validate the text in New window Conversion Factor
	public static WebElement mci_new_window_conversion_factor(WebDriver driver)
    {
       element = driver.findElement(By.id("lblHelpTipName"));
       return element;
    }

	//Click save changes
	public static WebElement mci_save_changes(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_ImglkBtnSave"));
       return element;
    }

	//Return to the same page [Manage Company Information]
	public static WebElement mci_return_to_company_information(WebDriver driver)
    {
       element = driver.findElement(By.xpath(".//*[@id='popup-confirm']/table/tbody/tr/td[1]/input"));
       return element;
    }

	//Navigate to Forecasting Time Periods [Calender page]
	public static WebElement mci_change_forecasting_time_periods(WebDriver driver)
    {
       element = driver.findElement(By.xpath(".//*[@id='popup-confirm']/table/tbody/tr/td[2]/input"));
       return element;
    }
	
	//**************************** Manage Users ******************************************

	//Click Manage Users menu
	public static WebElement mus_manage_users_menu(WebDriver driver)
    {
       element = driver.findElement(By.id("menuItemHilite22"));
       return element;
    }
	
	//Check Page Opens
	public static WebElement mus_manage_users_opens(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_ImgManageUsers"));
       return element;
    }
	
	//Check Page Opens
	public static WebElement mus_add_users_manually_opens(WebDriver driver)
    {
       element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_tblAddUserManually']/tbody/tr[1]/td/b"));
       return element;
    }

	//Click Add Users Manually
	public static WebElement mus_add_users_manually(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_imgAddUserManually"));
       return element;
    }

	//Enter First Name
	public static WebElement mus_first_name(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_userGrid_User" + commonLibrary.curTableRow + "_txtFirstName"));
       return element;
    }

	//Enter Middle Name
	public static WebElement mus_middle_name(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_userGrid_User" + commonLibrary.curTableRow + "_txtMiddleName"));
       return element;
    }

	//Enter Last Name
	public static WebElement mus_last_name(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_userGrid_User" + commonLibrary.curTableRow + "_txtLastName"));
       return element;
    }

	//Enter EMail Id 
	public static WebElement mus_email_id(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_userGrid_User" + commonLibrary.curTableRow + "_txtEmail"));
       return element;
    }

	//Enter First Name
	public static WebElement mus_display_name(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_userGrid_User" + commonLibrary.curTableRow + "_txtDisplayName"));
       return element;
    }

	//Clear all data in table
	public static WebElement mus_clear_all(WebDriver driver)
    {
       element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_tblAddUserManually']/tbody/tr[2]/td/span"));
       return element;
    }

	//First Name Error Message
	public static WebElement mus_first_name_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_userGrid_User" + commonLibrary.curTableRow + "_lblFirstNameMsg"));
       return element;
    }

	//Last Name Error Message
	public static WebElement mus_last_name_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_userGrid_User" + commonLibrary.curTableRow + "_lblLastNameMsg"));
       return element;
    }

	//EMail Error Message
	public static WebElement mus_email_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_userGrid_User" + commonLibrary.curTableRow + "_lblError"));
       return element;
    }

	//Empty First Name Error Message in Add users 
	public static WebElement mus_empty_first_name_validator(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_userGrid_User" + commonLibrary.curTableRow + "_lblFirstNameMsg"));
       return element;
    }

	//Empty Last Name Error Message in Add users
	public static WebElement mus_empty_last_name_validator(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_userGrid_User" + commonLibrary.curTableRow + "_lblLastNameMsg"));
       return element;
    }	

	//Empty EMail Id Error Message 
	public static WebElement mus_empty_email_validator(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_userGrid_User" + commonLibrary.curTableRow + "_lblError"));
       return element;
    }

	//Empty First Name Error Message in Edit users 
	public static WebElement mus_edit_empty_first_name_validator(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditUsersInfo_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_lblFirstNameErrMsg"));
       return element;
    }

	//Empty Last Name Error Message in Edit users
	public static WebElement mus_edit_empty_last_name_validator(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditUsersInfo_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_lblLastNameErrMsg"));
       return element;
    }

	//Invalid EMail Id Error Message 
	public static WebElement mus_invalid_email_validator(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_userGrid_User" + commonLibrary.curTableRow + "_lblError"));
       return element;
    }

	//Existing EMail Id Error Message 
	public static WebElement mus_existing_email_validator(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_userGrid_User" + commonLibrary.curTableRow + "_lblError"));
       return element;
    }
	
	//Click Save changes
	public static WebElement mus_save_changes(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnAddUsers"));
       return element;
    }
	
	//Click Add users using an Excel File 
	public static WebElement mus_add_users_excel_menu(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_imgAddUserusingExl"));
       return element;
    }
	
	//Download Excel File 
	public static WebElement mus_download_excel_file(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnDownload"));
       return element;
    }
	
	//Click Add users using an Excel File 
	public static WebElement mus_browse_excel_file(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_FileUpload1"));
       return element;
    }
	
	//Click Add users using an Excel File 
	public static WebElement mus_upload_excel(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnImport"));
       return element;
    }
    
    //Click Edit or Delete users  
  	public static WebElement mus_edit_users_menu(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_imgEditUsers"));
	   return element;
	}
    
    //Hover Display name
  	public static WebElement mus_edit_display_name_icon(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_dgEditUsersInfo_ctl02_imgHelp1"));
	   return element;
	}
    
    //Hover Show All
  	public static WebElement mus_edit_show_all_icon(WebDriver driver)
	{
	   element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_dgEditUsersInfo']/tbody/tr[1]/td[5]/img"));
	   return element;
	}
    
    //Edit or Delete users Page Select
  	public static WebElement mus_edit_users_page_select(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_ddlSelectPage"));
	   return element;
	}

	//Edit First Name
	public static WebElement mus_edit_first_name(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditUsersInfo_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_txtEditUsersFirstName"));
       return element;
    }

	//Edit Last Name
	public static WebElement mus_edit_last_name(WebDriver driver)
    {
		String elm1 = "ctl00_ContentMenu_dgEditUsersInfo_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_txtEditUsersLastName";
       element = driver.findElement(By.id(elm1));
       return element;
    }

	//Edit EMail Id 
	public static WebElement mus_edit_email_id(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditUsersInfo_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_txtEditUsersEmail"));
       return element;
    }

	//Edit Display name 
	public static WebElement mus_edit_display_name(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditUsersInfo_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_txtEditDisplayName"));
       return element;
    }

	//Refresh button in Edit Users page
	public static WebElement mus_refresh(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnRefreshEditUsers"));
       return element;
    }

	//First Name Error Message in Edit
	public static WebElement mus_edit_first_name_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditUsersInfo_ctl" + commonLibrary.curTableRow + "_lblFirstNameErrMsg"));
       return element;
    }

	//Last Name Error Message
	public static WebElement mus_edit_last_name_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditUsersInfo_ctl" + commonLibrary.curTableRow + "_lblLastNameErrMsg"));
       return element;
    }

	//Delete CheckBox
	public static WebElement mus_edit_delete_checkbox(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditUsersInfo_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_chkUsersInfoDelete"));
       return element;
    }

	//Delete All CheckBox
	public static WebElement mus_delete_all_checkbox(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_chkSelectAll"));
       return element;
    }

    //Update(save) changes
  	public static WebElement mus_update_changes(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_btnEditUsersInfo"));
	   return element;
	}
    
    //Edit or Delete users Page Select
  	public static WebElement return_element(WebDriver driver, String locator)
	{
	   element = driver.findElement(By.id(locator));
	   return element;
	}
  	
  	//ACTIVATE USER FROM THE EMAIL LINK
    //Password in activation page
  	public static WebElement mus_activation_new_password(WebDriver driver)
	{
	   element = driver.findElement(By.id("txtNewPassword"));
	   return element;
	}
  	
  	//Confirm Password in activation page
  	public static WebElement mus_activation_confirm_password(WebDriver driver)
	{
	   element = driver.findElement(By.id("txtConfirmPassword"));
	   return element;
	}
  	
  	//Security Question in activation page
  	public static WebElement mus_activation_security_question(WebDriver driver)
	{
	   element = driver.findElement(By.id("ddlSecurityQues"));
	   return element;
	}
  	
  	//Security Question in activation page
  	public static WebElement mus_activation_security_answer(WebDriver driver)
	{
	   element = driver.findElement(By.id("txtSecurityAns"));
	   return element;
	}
  	
  	//Display name in activation page
  	public static WebElement mus_activation_display_name(WebDriver driver)
	{
	   element = driver.findElement(By.id("txtDisplayName"));
	   return element;
	}
  	
  	//Receive occasional mails in activation page
  	public static WebElement mus_receive_mails(WebDriver driver)
	{
	   element = driver.findElement(By.id("chkCookie"));
	   return element;
	}
  	
  	//Accept terms and conditions in activation page
  	public static WebElement mus_accept_terms(WebDriver driver)
	{
	   element = driver.findElement(By.id("chkAgree"));
	   return element;
	}
  	
  	//Terms of use link in activation page
  	public static WebElement mus_terms_of_use(WebDriver driver)
	{
	   element = driver.findElement(By.id("btnTermsOfUse"));
	   return element;
	}
  	
  	//Activate account in activation page
  	public static WebElement mus_activate_changes(WebDriver driver)
	{
	   element = driver.findElement(By.id("imgbtnSaceChanges"));
	   return element;
	}
  	
  	//Icon in Security Question, Hover Text
  	public static WebElement mus_security_question_icon(WebDriver driver)
	{
//	   element = driver.findElement(By.id("ctl00_ContentMenu_imgques1"));
  		element = driver.findElement(By.id("imgques1"));
  		return element;
	}
  	
  	//Icon in Security Answer, Hover Text
  	public static WebElement mus_security_answer_icon(WebDriver driver)
	{
	   element = driver.findElement(By.id("Imgques2"));
	   return element;
	}
  	
  	//Icon in Display Name, Hover Text
  	public static WebElement mus_display_name_icon(WebDriver driver)
	{
	   element = driver.findElement(By.id("Imgques3"));
	   return element;
	}
	
	//Check Terms of Use, Page Opens, Check Text: "Terms of Use"
	public static WebElement mus_terms_of_use_opens(WebDriver driver)
    {
       element = driver.findElement(By.xpath("html/body/div[2]/h2"));
       return element;
    }
	
	//Activate without enter data "Enter confirm password Enter security answer"
	//Confirm password should match with your password Enter security answer
	//Confirm password should match with your password
	//Please accept the terms of use before proceeding
	
	//Success Message
	//Your account has been activated successfully.
	//http://localhost:1681/UserActivation.aspx?UID=1674&Activate=ubgcnhPoMTL7sjri&Assistant=Assistant1
	//http://localhost:1681/FreeTrialCompanyUserHomePage.aspx

  	//Check welcome page opens
  	public static WebElement mus_welcome_page_opens(WebDriver driver)
	{
	   element = driver.findElement(By.id(".//*[@id='pnlUserActivation']/table/tbody/tr/td/div[2]/div/div[2]/div[2]/div/div[1]/a"));
	   return element;
	}
  	
  	//Download Quick Start Guide
  	public static WebElement mus_download_quick_start_guide(WebDriver driver)
	{
	   element = driver.findElement(By.xpath("btnDownload"));
	   return element;
	}
  	
  	//Press Here to Start Button 
  	public static WebElement mus_press_here_to_start(WebDriver driver)
	{
	   element = driver.findElement(By.xpath(".//*[@id='pnlUserActivation']/table/tbody/tr/td/div[2]/div/div[2]/div[2]/div/div[1]/a"));
	   return element;
	}
  	
  	//Company user home page, check "Message" image exist
  	public static WebElement mus_company_user_home_message(WebDriver driver)
	{
	   element = driver.findElement(By.xpath(".//*[@id='aspnetForm']/table[3]/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[3]/img"));
	   return element;
	}
  	
  	//Company user home page, check "System Status" image exist
  	public static WebElement mus_company_user_home_system_status(WebDriver driver)
	{
	   element = driver.findElement(By.xpath(".//*[@id='aspnetForm']/table[3]/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr[4]/td/img"));
	   return element;
	}
  	
	//**************************** Manage Calendars ******************************************
    //Click menu "Manage Calendars"
  	public static WebElement mcl_menu_manage_calendar(WebDriver driver)
	{
	   element = driver.findElement(By.id("menuItemHilite21"));
	   return element;
	}
  	
    //Click More Information Link in start page of calendar
  	public static WebElement mcl_more_information(WebDriver driver)
	{
	   element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_trSalesPeriods']/td[1]/a"));
	   return element;
	}
  	
    //More Information window content
  	public static WebElement mcl_new_window_more_information(WebDriver driver)
	{
	   element = driver.findElement(By.id("lblHelpTipName"));
	   return element;
	}
  	
    //Click More Information Link in start page of calendar
  	public static WebElement mcl_sales_period(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_SalesPeriods"));
	   return element;
	}
  	
    //Select the day
  	public static WebElement mcl_day_effective(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_DayEffective"));
	   return element;
	}
  	
    //Click Save changes in Date format
  	public static WebElement mcl_save_changes_date_format(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_lnkSaveDateFormat"));
	   return element;
	}
  	
    //Date Format - Image Button
  	public static WebElement mcl_date_format_page(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_imgDateFormat"));
	   return element;
	}
  	
    //Date Format - Select Box
  	public static WebElement mcl_date_format_select(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_ddlDateFormat"));
	   return element;
	}
  	
    //Selling Days - Image Button
  	public static WebElement mcl_selling_days_page(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_imgSellingDays"));
	   return element;
	}

    //What are Selling Days - Link
  	public static WebElement mcl_whare_are_selling_days(WebDriver driver)
	{
	   element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_tblSellingDays']/tbody/tr[2]/td[1]/a"));
	   return element;
	}
	
	//Validate title in New window Selling Days
	public static WebElement mcu_new_window_selling_days_title(WebDriver driver)
    {
       element = driver.findElement(By.id("lblHelpTipName"));
       return element;
    }
	
	//Validate the content in New window Selling Days
	public static WebElement mcu_new_window_selling_days_content(WebDriver driver)
    {
       element = driver.findElement(By.id("lblHelpTipContent"));
       return element;
    }
  	
    //Set working day input on Monday
  	public static WebElement mcl_selling_monday(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_ddlIndMon"));
	   return element;
	}
  	
    //Set working day input on Tuesday
  	public static WebElement mcl_selling_tuesday(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_ddlIndTue"));
	   return element;
	}
  	
    //Set working day input on Wednesday
  	public static WebElement mcl_selling_wednesday(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_ddlIndWed"));
	   return element;
	}
  	
    //Set working day input on Thursday
  	public static WebElement mcl_selling_thursday(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_ddlIndThu"));
	   return element;
	}
  	
    //Set working day input on Friday
  	public static WebElement mcl_selling_friday(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_ddlIndFri"));
	   return element;
	}
  	
    //Set working day input on Saturday
  	public static WebElement mcl_selling_saturday(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_ddlIndSat"));
	   return element;
	}
  	
    //Set working day input on Sunday
  	public static WebElement mcl_selling_sunday(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_ddlIndSun"));
	   return element;
	}
  	
    //Total selling days in a week - Textbox
  	public static WebElement mcl_total_selling_days_1(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_txtNoOfSellDays"));
	   return element;
	}
  	
    //Total selling days in a week - Textbox
  	public static WebElement mcl_total_selling_days_2(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_txtNoOfSellDays"));
	   return element;
	}
  	
    //Save Selling days
  	public static WebElement mcl_save_selling_days(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_btnSaveCalendar"));
	   return element;
	}
  	
  	//****  HOLIDAYS Section  ****
  	
    //Open Holidays page
  	public static WebElement mcl_menu_holidays(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_imgHolidays"));
	   return element;
	}

    //Two years before
  	public static WebElement mcl_holiday_edit_before_two_year(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_gvEditHolidays_ctl" + String.format("%02d", (01 + Integer.parseInt(commonLibrary.curTableRow))) + "_ccThreeYearsAfter_txtDate"));
	   return element;
	}

    //Name of the Holiday
  	public static WebElement mcl_holiday_name(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_newHolidaysGrid_holiday" + String.format("%01d", (01 + Integer.parseInt(commonLibrary.curTableRow))) + "_txtHolidayName"));
	   return element;
	}

    //Two years before
  	public static WebElement mcl_holiday_before_two_year(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_newHolidaysGrid_holiday" + String.format("%01d", (01 + Integer.parseInt(commonLibrary.curTableRow))) + "_ccTwoYearsBefore_txtDate"));
	   return element;
	}

    //one year Before
  	public static WebElement mcl_holiday_before_one_year(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_newHolidaysGrid_holiday" + String.format("%01d", (01 + Integer.parseInt(commonLibrary.curTableRow))) + "_ccOneYearsBefore_txtDate"));
	   return element;
	}

    //Current year
  	public static WebElement mcl_holiday_current_year(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_newHolidaysGrid_holiday" + String.format("%01d", (01 + Integer.parseInt(commonLibrary.curTableRow))) + "_ccCurrentYear_txtDate"));
	   return element;
	}

    //One year after
  	public static WebElement mcl_holiday_after_one_year(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_newHolidaysGrid_holiday" + String.format("%01d", (01 + Integer.parseInt(commonLibrary.curTableRow))) + "_ccOneYearAfter_txtDate"));
	   return element;
	}

    //Two years after
  	public static WebElement mcl_holiday_after_two_year(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_newHolidaysGrid_holiday" + String.format("%01d", (01 + Integer.parseInt(commonLibrary.curTableRow))) + "_ccTwoYearAfter_txtDate"));
	   return element;
	}

    //Three years after
  	public static WebElement mcl_holiday_after_three_year(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_newHolidaysGrid_holiday" + String.format("%01d", (01 + Integer.parseInt(commonLibrary.curTableRow))) + "_ccThreeYearAfter_txtDate"));
	   return element;
	}

    //Save Holidays
  	public static WebElement mcl_holidays_save(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_btnSaveHolidays"));
	   return element;
	}

    //Save New Holidays
  	public static WebElement mcl_add_holidays_save(WebDriver driver)
	{
	   element = driver.findElement(By.id("ctl00_ContentMenu_lnkAddNewHolidays"));
	   return element;
	}
  	
  	
//  ***************** 	Manage Products  *********************
  	//Manage Products menu
  	public static WebElement mpc_manage_products_menu(WebDriver driver)
    {
  		element = driver.findElement(By.id("menuItemHilite23"));
  		return element;
    }
  	
  	//Add Product categories menu
  	public static WebElement mpc_add_product_cagegories_menu(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_imgAddProductCat"));
  		return element;
    }
  	
  	//Edit Product categories menu
  	public static WebElement mpc_edit_product_cagegories_menu(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_imgEditPdtCat"));
  		return element;
    }
  	
  	//Add Products Manually menu
  	public static WebElement mpc_add_products_manually_menu(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_imgAddPdtManually"));
  		return element;
    }
  	
  	//Add Products using Excel menu
  	public static WebElement mpc_add_products_using_excel_menu(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_imgAddusingExl"));
  		return element;
    }
  	
  	//Edit Products Menu
  	public static WebElement mpc_edit_products_menu(WebDriver driver)
    {
  		element = driver.findElement(By.xpath(".//*[@id='aspnetForm']/table[3]/tbody/tr[1]/td/table[1]/tbody/tr[3]/td[7]/input[1]"));
  		return element;
    }
  	
  	//What are product categories link
  	public static WebElement mpc_what_are_product_categories_link(WebDriver driver)
    {
  		element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_tblAddPdtCat']/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/a"));
  		return element;
    }
	
	//Validate title in New window Sales Volume Indicator
	public static WebElement mpc_new_window_product_category_title(WebDriver driver)
    {
       element = driver.findElement(By.id("lblHelpTipName"));
       return element;
    }
	
	//Validate the content in New window Sales Volume Indicator
	public static WebElement mpc_new_window_product_category_content(WebDriver driver)
    {
       element = driver.findElement(By.id("lblHelpTipContent"));
       return element;
    }
	
	//Product category text box
	public static WebElement mpc_add_product_category(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_PdtcatGrid_Pdtcat" + commonLibrary.curTableRow + "_txtCatName"));
       return element;
    }
	
	public static WebElement mpc_add_product_category_2(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_PdtcatGrid_Pdtcat" + commonLibrary.curTableRow + "_txtCatName"));
       return element;
    }
	
	//Category manager select box
	public static WebElement mpc_add_category_manager(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_PdtcatGrid_Pdtcat" + commonLibrary.curTableRow + "_ddlCatMgr"));
       return element;
    }
	
	public static WebElement mpc_add_category_manager_2(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_PdtcatGrid_Pdtcat" + commonLibrary.curTableRow + "_ddlCatMgr"));
       return element;
    }

	//Enter Password
	public static WebElement mpc_prod_category_page_1(WebDriver driver)
    {
       element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_dgEditPdtCatg']/tbody/tr[7]/td/span"));
       return element;
    }

	//Save Category Button
	public static WebElement mpc_save_product_category(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnSavePdtCatg"));
       return element;
    }

	//Product category empty error message - Label
	public static WebElement mpc_product_category_empty_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_PdtcatGrid_Pdtcat" + commonLibrary.curTableRow + "_lblError"));
       return element;
    }
	
	public static WebElement mpc_product_category_existing_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_PdtcatGrid_Pdtcat" + commonLibrary.curTableRow + "_lblError"));
       return element;
    }
	
	public static WebElement mpc_product_category_duplicate_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_PdtcatGrid_Pdtcat" + commonLibrary.curTableRow + "_lblError"));
       return element;
    }
	
	public static WebElement mpc_what_is_conversion_factor(WebDriver driver)
    {
       element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_AddProductGrid_hcpdtKPSFactor']/a"));
       return element;
    }

	public static WebElement mpc_what_is_conversion_factor_edit_products(WebDriver driver)
    {
       element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_dgEditPdtInfo']/tbody/tr[1]/th[6]/a"));
       return element;
    }
    
	//Validate title in New window What is conversion factor
	public static WebElement mpc_new_window_conversion_factor_title(WebDriver driver)
    {
       element = driver.findElement(By.id("lblHelpTipName"));
       return element;
    }
	
	//Validate the content in New window What is conversion factor
	public static WebElement mpc_new_window_conversion_factor_content(WebDriver driver)
    {
       element = driver.findElement(By.id("lblHelpTipContent"));
       return element;
    }
	
	//** Edit Product Category Objects **
	//Category name textbox  
	public static WebElement mpc_edit_product_category(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditPdtCatg_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_txtPdtCatname"));
       return element;
    }  
	
	public static WebElement mpc_edit_category_manager(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditPdtCatg_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_ddlCatMgr"));
       return element;
    }
	
	public static WebElement mpc_select_all_delete_product_categories(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_chkSelectAllCatg"));
       return element;
    }
	
	public static WebElement mpc_refresh_product_categories_edit(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnRefreshEditProductCategory"));
       return element;
    }
	
	public static WebElement mpc_save_product_categories_edit(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnUpdatePdtCatg"));
       return element;
    }
	
	public static WebElement mpc_edit_product_category_empty_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditPdtCatg_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_lblErrorEditCat"));
       return element;
    }
	
	public static WebElement mpc_edit_product_category_duplicate_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditPdtCatg_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_lblErrorEditCat"));
       return element;
    }
	
	//** Add Products Object **
	public static WebElement mpc_add_product_no(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_AddProductGrid_ProductDetail" + commonLibrary.curTableRow + "_txtPdtNo"));
       return element;
    }
	
	public static WebElement mpc_add_product_name(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_AddProductGrid_ProductDetail" + commonLibrary.curTableRow + "_txtPdtname"));
       return element;
    }
	
	public static WebElement mpc_select_product_category(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_AddProductGrid_ProductDetail" + commonLibrary.curTableRow + "_ddlPdtCat"));
       return element;
    }
	
	public static WebElement mpc_add_selling_price(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_AddProductGrid_ProductDetail" + commonLibrary.curTableRow + "_txtSellprice"));
       return element;
    }
	
	public static WebElement mpc_add_product_unit_of_measure(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_AddProductGrid_ProductDetail" + commonLibrary.curTableRow + "_txtUOM"));
       return element;
    }
	
	public static WebElement mpc_add_conversion_factore(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_AddProductGrid_ProductDetail" + commonLibrary.curTableRow + "_txtKPSFactor"));
       return element;
    }
    
    public static WebElement mpc_save_products(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnAddPdts"));
       return element;
    }
	
	public static WebElement mpc_empty_product_no_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_AddProductGrid_ProductDetail" + commonLibrary.curTableRow + "_lblPdtNoErrMsg"));
       return element;
    }
    
    //** Edit Products Object **
	public static WebElement mpc_edit_product_no(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditPdtInfo_ctl" + String.format("%02d", (01 + Integer.parseInt(commonLibrary.curTableRow))) + "_lblEditPdtNo"));
       return element;
    }
	
	public static WebElement mpc_edit_product_name(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditPdtInfo_ctl" + String.format("%02d", (01 + Integer.parseInt(commonLibrary.curTableRow))) + "_txtEditPdtName"));
       return element;
    }
	
	public static WebElement mpc_edit_select_product_category(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditPdtInfo_ctl" + String.format("%02d", (01 + Integer.parseInt(commonLibrary.curTableRow))) + "_ddlPdtCatName"));
       return element;
    }
	
	public static WebElement mpc_edit_selling_price(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditPdtInfo_ctl" + String.format("%02d", (01 + Integer.parseInt(commonLibrary.curTableRow))) + "_txtEditSalesPrice"));
       return element;
    }
	
	public static WebElement mpc_edit_product_unit_of_measure(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditPdtInfo_ctl" + String.format("%02d", (01 + Integer.parseInt(commonLibrary.curTableRow))) + "_txtEditUOM"));
       return element;
    }
	
	public static WebElement mpc_edit_conversion_factore(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditPdtInfo_ctl" + String.format("%02d", (01 + Integer.parseInt(commonLibrary.curTableRow))) + "_txtEditKPSFactor"));
       return element;
    }
    
    public static WebElement mpc_save_products_edit(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btEditPdtInfo"));
       return element;
    }
    
    public static WebElement mpc_filter_products(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_ddlArrangeProducts"));
       return element;
    }
    
    public static WebElement mpc_filter_product_category(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_ddlAllProductCategory"));
       return element;
    }
    
	//Products error validations 
    public static WebElement  mpc_empty_product_num_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_AddProductGrid_ProductDetail" + commonLibrary.curTableRow + "_lblPdtNoErrMsg"));
       return element;
    }
    
    public static WebElement  mpc_duplicate_product_num_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_AddProductGrid_ProductDetail" + commonLibrary.curTableRow + "_lblPdtNoErrMsg"));
       return element;
    }
    
    public static WebElement  mpc_empty_product_name_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_AddProductGrid_ProductDetail" + commonLibrary.curTableRow + "_lblPdtNameErrMsg"));
       return element;
    }
    
    public static WebElement  mpc_duplicate_product_name_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_AddProductGrid_ProductDetail" + commonLibrary.curTableRow + "_lblPdtNameErrMsg"));
       return element;
    }
    
    public static WebElement  mpc_selling_price_negative_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_AddProductGrid_ProductDetail" + commonLibrary.curTableRow + "_lblSellPriceErrMsg"));
       return element;
    }
    
    public static WebElement  mpc_selling_price_number_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_AddProductGrid_ProductDetail" + commonLibrary.curTableRow + "_lblSellPriceErrMsg"));
       return element;
    }
    
    public static WebElement  mpc_conversion_factor_negative_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_AddProductGrid_ProductDetail" + commonLibrary.curTableRow + "_lblKPSFactorErrMsg"));
       return element;
    }
    
    public static WebElement  mpc_conversion_factor_number_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_AddProductGrid_ProductDetail" + commonLibrary.curTableRow + "_lblKPSFactorErrMsg"));
       return element;
    }
//  ***************** 	Manage Customers  *********************
  	//Manage Customers menu
  	public static WebElement mcu_manage_customers_menu(WebDriver driver)
    {
  		element = driver.findElement(By.id("menuItemHilite24"));
  		return element;
    }
  	
  	//Add Customer Groups menu
  	public static WebElement mcu_add_customer_groups_menu(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_imgAddCustgrps"));
  		return element;
    }
  	
  	//Edit Customer Groups menu
  	public static WebElement mcu_edit_customer_groups_menu(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_imgEditCustgrps"));
  		return element;
    }
  	
  	//Add Customers menu
  	public static WebElement mcu_add_customers_manually_menu(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_imgAddCustManually"));
  		return element;
    }
  	
  	//Add Customers using Excel menu
  	public static WebElement mcu_add_customers_using_excel_menu(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_imgAddCustUsingExl"));
  		return element;
    }
  	
  	//Edit Customers Menu
  	public static WebElement mcu_edit_customers_menu(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_imgEditCust"));
  		return element;
    }
  	
  	//Select Page 1
  	public static WebElement mcu_select_page_1(WebDriver driver)
    {
  		element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_dgEditCustomerGroup']/tbody/tr[5]/td/a"));
  		return element;
    }
  	
  	//What are Customers Groups link
  	public static WebElement mcu_what_are_customer_groups_link(WebDriver driver)
    {
  		element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_tblAddcustomergps']/tbody/tr[2]/td/a"));
  		return element;
    }
	
	//Validate title in New window Customers Groups
	public static WebElement mcu_new_window_customer_groups_title(WebDriver driver)
    {
       element = driver.findElement(By.id("lblHelpTipName"));
       return element;
    }
	
	//Validate the content in New window Customers Groups
	public static WebElement mcu_new_window_customer_groups_content(WebDriver driver)
    {
       element = driver.findElement(By.id("lblHelpTipContent"));
       return element;
    }
	
	//Customer text box
	public static WebElement mcu_add_customer_group(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_customerGroups_Group" + commonLibrary.curTableRow + "_txtCustomerGroup"));
       return element;
    }
	
	//Account manager select box
	public static WebElement mcu_add_customer_account_manager(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_customerGroups_Group" + commonLibrary.curTableRow + "_ddlAccountManager"));
       return element;
    }
	
	//Description Text Box
	public static WebElement mcu_add_customer_description(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_customerGroups_Group" + commonLibrary.curTableRow + "_txtDescOfCustomerGroup"));
       return element;
    }
	
	//Customer text box
	public static WebElement mcu_add_customer_group_2(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_customerGroups_Group" + commonLibrary.curTableRow + "_txtCustomerGroup"));
       return element;
    }
	
	//Account manager select box
	public static WebElement mcu_add_customer_account_manager_2(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_customerGroups_Group" + commonLibrary.curTableRow + "_ddlAccountManager"));
       return element;
    }
	
	//Description Text Box
	public static WebElement mcu_add_customer_description_2(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_customerGroups_Group" + commonLibrary.curTableRow + "_txtDescOfCustomerGroup"));
       return element;
    }

	//Save Customer Groups Button
	public static WebElement mcu_save_manage_customers(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnSaveAddCustomersGroups"));
       return element;
    }

	//Save Edit Customer Groups Button
	public static WebElement mcu_save_manage_customers_edit(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnEditCustomerGroup"));
       return element;
    }

	//Manage Customers empty error message - Label
	public static WebElement mcu_customer_group_empty_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_customerGroups_Group" + commonLibrary.curTableRow + "_lblerr1"));
       return element;
    }
	
	public static WebElement mcu_customer_group_existing_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_customerGroups_Group" + commonLibrary.curTableRow + "_lblerr1"));
       return element;
    }
	
	public static WebElement mcu_customer_group_duplicate_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_customerGroups_Group" + commonLibrary.curTableRow + "_lblerr1"));
       return element;
    }

	//Delete All CheckBox
	public static WebElement mcu_clear_all_data_cus_groups(WebDriver driver)
    {
       element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_tblAddcustomergps']/tbody/tr[2]/td/span"));
       return element;
    }

	//Delete All CheckBox
	public static WebElement mcu_select_all_for_delete(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_chkSelectAll"));
       return element;
    }
	
	//Account manager select box
	public static WebElement mcu_edit_refresh(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_lbRefreshBtn"));
       return element;
    }
	
	//Customer text box
	public static WebElement mcu_edit_customer_groups(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditCustomerGroup_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_txtEditCustomerGroup"));
       return element;
    }
	
	//Account manager select box
	public static WebElement mcu_edit_account_manager(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditCustomerGroup_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_ddlCustomerGroupManager"));
       return element;
    }
	
	//Description Text Box
	public static WebElement mcu_edit_description(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditCustomerGroup_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_txtCustGroupDescription"));
       return element;
    }

	//Manage Customers Group Edit - empty error message - Label
	public static WebElement mcu_customer_group_edit_empty_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditCustomerGroup_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_lblErrorMsg"));
       return element;
    }
	
	public static WebElement mcu_customer_group_edit_existing_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditCustomerGroup_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_lblErrorMsg"));
       return element;
    }
	
	public static WebElement mcu_customer_group_edit_duplicate_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditCustomerGroup_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_lblErrorMsg"));
       return element;
    }
	
	//Add Customers Manually
	//Customer text box
	public static WebElement mcu_customer_name(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_SaleGrid_Sales" + commonLibrary.curTableRow + "_txtSalesAreasName1"));
       return element;
    }
	
	//Account manager - Select Box
	public static WebElement mcu_customer_rel_manager(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_SaleGrid_Sales" + commonLibrary.curTableRow + "_ddlSalesAreasManager1"));
       return element;
    }
	
	//Customer Group - Select Box
	public static WebElement mcu_customer_group(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_SaleGrid_Sales" + commonLibrary.curTableRow + "_ddlCustomerGroups"));
       return element;
    }
	
	//Description Text Box
	public static WebElement mcu_customer_description(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_SaleGrid_Sales" + commonLibrary.curTableRow + "_txtDescOfSalesArea1"));
       return element;
    }

	//Manage Customers empty error message - Label
	public static WebElement mcu_customer_empty_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_SaleGrid_Sales" + commonLibrary.curTableRow + "_lblerr1"));
       return element;
    }
	
	public static WebElement mcu_customer_existing_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_SaleGrid_Sales" + commonLibrary.curTableRow + "_lblerr1"));
       return element;
    }
	
	public static WebElement mcu_customer_duplicate_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_SaleGrid_Sales" + commonLibrary.curTableRow + "_lblerr1"));
       return element;
    }
	
	//Save Customers Manually - Button
	public static WebElement mcu_customers_save(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnSaveAddSalesArea"));
       return element;
    }
	
	//Click Add Customers using an Excel File 
	public static WebElement mus_upload_excel_customers(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnUpload"));
       return element;
    }
	
	//Customer Edit
	//Customer text box
	public static WebElement mcu_customer_edit_name(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditSalesArea_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_txtEditSalesAreaName"));
       return element;
    }
	
	//Account manager - Select Box
	public static WebElement mcu_customer_edit_rel_manager(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditSalesArea_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_ddlSalesAreaManager"));
       return element;
    }
	
	//Customer Group - Select Box
	public static WebElement mcu_customer_edit_group(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditSalesArea_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_ddlCustomergroup"));
       return element;
    }
	
	//Description Text Box
	public static WebElement mcu_customer_edit_description(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditSalesArea_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_txtEditDescOfSalesArea"));
       return element;
    }
	
	//Delete - CheckBox
	public static WebElement mcu_customer_edit_delete(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditSalesArea_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_chkSalesArea"));
       return element;
    }

	//Manage Customers Edit empty error message - Label
	public static WebElement mcu_customer_edit_empty_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditSalesArea_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_lblErrorMsg"));
       return element;
    }
	
	public static WebElement mcu_customer_edit_existing_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditSalesArea_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_lblErrorMsg"));
       return element;
    }
	
	public static WebElement mcu_customer_edit_duplicate_error(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_dgEditSalesArea_ctl" + String.format("%02d", (02 + Integer.parseInt(commonLibrary.curTableRow))) + "_lblErrorMsg"));
       return element;
    }
	
	//Refresh - Button
	public static WebElement mcu_customer_refresh(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_LinkButton1"));
       return element;
    }
	
	//Select All for Delete - CheckBox
	public static WebElement mcu_customer_select_all_delete(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_chkSelectCustomers"));
       return element;
    }
	
	//Save - Button
	public static WebElement mcu_customer_edit_save(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnEditAddSalesArea"));
       return element;
    }
	
//  ***************** 	Allocate Forecaster to Products  *********************
  	//Allocate forecasters to products  menu
  	public static WebElement afp_allocate_forcaster_menu(WebDriver driver)
    {
  		element = driver.findElement(By.id("menuItem25"));
  		return element;
    }
  	
  	//Set the rule for allocating forcaster - menu
  	public static WebElement afp_set_the_rule_forcaster_menu(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_imgAllocate"));
  		return element;
    }
  	
  	//Manually adjust forecaster allocations - menu
  	public static WebElement afp_manually_adjust_forcaster_menu(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_imgManuallyadjustalloc"));
  		return element;
    }
  	
  	//Upload Allocations using Excel - menu
  	public static WebElement afp_upload_allocation_using_excel_menu(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_imgUploadUsingExl"));
  		return element;
    }
  	
  	//Change allocation rule to - Select Box
  	public static WebElement afp_change_allocation_rule_to(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_ddlAllocation"));
  		return element;
    }
  	
  	//Save Changes Set Rule - Button
  	public static WebElement afp_save_changes_set_rule(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_btnSaveChanges"));
  		return element;
    }
  	
  	//Save Changes Set Rule - Button
  	public static WebElement afp_save_continue(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_btnOk"));
  		return element;
    }
  	
  	//**** Manually Adjust Forecaster Allocations ****
  	//Product Category - Select Box
  	public static WebElement afp_product_category(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_ddlProductCategory"));
  		return element;
    }
  	
  	//Customer - Select Box
  	public static WebElement afp_customer(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_ddlCustomer"));
  		return element;
    }
  	
  	//Product Name - Select Box
  	public static WebElement afp_product_name(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_ddlProductName"));
  		return element;
    }
  	
  	//Forecaster - Select Box
  	public static WebElement afp_forecaster(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_ddlForecaster"));
  		return element;
    }
  	
  	//Allocate Forecaster - Button
  	public static WebElement afp_allocate_forecaster(WebDriver driver)
    {
  		element = driver.findElement(By.id("ctl00_ContentMenu_btnAllocateForecaster"));
  		return element;
    }
  	
  	//****************** Upload Sales History ***************************
  	//Move to Upload Data menu
  	public static WebElement upl_upload_data_menu(WebDriver driver)
    {
       element = driver.findElement(By.xpath(".//*[@id='ctl00_miUploadAndDownload']/img"));
       return element;
    }
  		
  	//Move to Reports menu
  	public static WebElement upl_reports_menu(WebDriver driver)
    {
       element = driver.findElement(By.xpath(".//*[@id='ctl00_miReportAndPlans']/img"));
       return element;
    }
  	
  	//Click Menu "Upload Sales History"
  	public static WebElement upl_upload_sales_history_menu(WebDriver driver)
    {
       element = driver.findElement(By.id("menuItemHilite17"));
       return element;
    }
  	
  	//Click Menu "Review Forecast"
  	public static WebElement upl_review_forecast_menu(WebDriver driver)
    {
       element = driver.findElement(By.id("menuItemHilite15"));
       return element;
    }
		
	//See an Example  - Link
	public static WebElement upl_see_an_example(WebDriver driver)
	{
		element = driver.findElement(By.id("ctl00_ContentMenu_btnMonthlyDMY"));
//	   element = driver.findElement(By.id("ctl00_ContentMenu_btnWeeklyMDY"));
	   return element;
	}
	
	//Upload Sales History using an Excel File 
	public static WebElement upl_upload_excel_sales_history(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnUpload"));
       return element;
    }
  	
	//Download Excel File
	public static WebElement upl_download_excel_file(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_BtnDateFormat1"));
       return element;
    }
  	
	//Review Forecast From - Select Box
	public static WebElement upl_review_forecast_from(WebDriver driver)
    {
       element = driver.findElement(By.id("ddlForecastFrom"));
       return element;
    }
  	
	//Level of Review - Select Box
	public static WebElement upl_level_of_review(WebDriver driver)
    {
       element = driver.findElement(By.id("ddlForecastBy"));
       return element;
    }
  	
	//Category - Select Box
	public static WebElement upl_category(WebDriver driver)
    {
       element = driver.findElement(By.id("ddlFirstDropDown"));
       return element;
    }
  	
	//Historical Forecast - Select Box
	public static WebElement upl_historical_forecast(WebDriver driver)
    {
       element = driver.findElement(By.id("ddlHistoricalForecast"));
       return element;
    }
  	
	//Forecast Type - Select Box
	public static WebElement upl_forecast_type(WebDriver driver)
    {
       element = driver.findElement(By.id("ddlForecastType"));
       return element;
    }
	
	//Click on the New sales forecasting system email
	public static WebElement upl_open_upload_sales_data_error_mail(WebDriver driver)
    {
       element = driver.findElement(By.xpath("//div [@class='y6']/span[contains(.,'Errors in data file uploaded')]"));
       return element;
    }
	
	//Click on the New sales forecasting system email
	public static WebElement upl_open_upload_sales_data_success_mail(WebDriver driver)
    {
       element = driver.findElement(By.xpath("//div [@class='y6']/span[contains(.,'Data successfully uploaded')]"));
       return element;
    }
	
	//Click Activation Link 
	public static WebElement upl_sales_history_data(WebDriver driver)
    {
       element = driver.findElement(By.xpath("//div[1]/table/tbody/tr/td/a[contains(.,'http://www.so-plan.info/UserActivation.aspx')]"));
//	       element = driver.findElement(By.xpath("//div[1]/table/tbody/tr/td/a[1]"));
       return element;
    }
	

	//****************** Upload Sales Forecast ***************************
  	//Click Menu "Upload Sales History"
  	public static WebElement upl_upload_sales_forecast_menu(WebDriver driver)
    {
       element = driver.findElement(By.id("menuItemHilite18"));
       return element;
    }
  	
  	//See an Example  - Link
  	public static WebElement upl_see_an_example_forecast(WebDriver driver)
  	{
  	   element = driver.findElement(By.id("ctl00_ContentMenu_btnWeeklyMDY"));
  	   return element;
  	}
  	
  	//Forecast Type  - Select Box
  	public static WebElement upl_sales_forecast_type(WebDriver driver)
  	{
  	   element = driver.findElement(By.id("ctl00_ContentMenu_ddlForecastType"));
  	   return element;
  	}
	
	//Upload Sales Forecast using an Excel File 
	public static WebElement upl_upload_excel_sales_forecast(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnUpload"));
       return element;
    }
	
	//****************** Upload Budget and Target ***************************
  	//Click Menu "Upload Sales History"
  	public static WebElement upl_upload_buget_target_menu(WebDriver driver)
    {
       element = driver.findElement(By.id("menuItemHilite19"));
       return element;
    }
  	
  	//See an Example  - Link
  	public static WebElement upl_see_an_example_budget(WebDriver driver)
  	{
  	   element = driver.findElement(By.id("ctl00_ContentMenu_btnMonthlyMDY"));
  	   return element;
  	}
	
	//Upload Sales Forecast using an Excel File 
	public static WebElement upl_upload_excel_budget_target(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnUpload"));
       return element;
    }
  	
	//Product - Select Box
	public static WebElement upl_product(WebDriver driver)
    {
       element = driver.findElement(By.id("ddlFirstDropDown"));
       return element;
    }
  	
	//Budget and Target - Select Box
	public static WebElement upl_budget_target(WebDriver driver)
    {
       element = driver.findElement(By.id("ddlBudgetAndTarget"));
       return element;
    }
  	
	//Budget and Target - Select Box
	public static WebElement upl_budget_target_data(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_ddlDataType"));
       return element;
    }
  	
	//Unit Currency - Select Box
	public static WebElement upl_unit_currency(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_ddlDataFormat"));
       return element;
    }
	
	//Click on the New sales forecasting system email
	public static WebElement upl_open_upload_budget_error_mail(WebDriver driver)
    {
       element = driver.findElement(By.xpath("//div [@class='y6']/span[contains(.,'Errors in data file uploaded')]"));
       return element;
    }
	
	
	//******************************* Forecast Sales ********************************
	//Forecast sales - Menu
	public static WebElement fsl_menu(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_miForecast"));
       return element;
    }
	
	//Forecast by - Select Box
	public static WebElement fsl_forecast_by(WebDriver driver)
    {
       element = driver.findElement(By.id("ddlForecastBy"));
       return element;
    }
	
	//Forecast type - Select Box
	public static WebElement fsl_forecast_type(WebDriver driver)
    {
       element = driver.findElement(By.id("ddlForecastType"));
       return element;
    }
	
	//Product or Category - Select Box
	public static WebElement fsl_product_category(WebDriver driver)
    {
       element = driver.findElement(By.id("ddlProductOrCategory"));
       return element;
    }
	
	//Customer - Select Box
	public static WebElement fsl_customer(WebDriver driver)
    {
       element = driver.findElement(By.id("ddlSalesArea"));
       return element;
    }
	
	//Save this algorithm - Check Box
	public static WebElement fsl_save_this_algorithm(WebDriver driver)
    {
       element = driver.findElement(By.id("chkSaveAlgorithm"));
       return element;
    }
	
	//Parameter name - Textbox
	public static WebElement fsl_parameter_name(WebDriver driver)
    {
       element = driver.findElement(By.id("txtAlgorithmParam"));
       return element;
    }
	
	//***** Historical forecasting performance *****
	//Forecast Error - Textbox
	public static WebElement fsl_forecast_error(WebDriver driver)
    {
       element = driver.findElement(By.id("tbHistForecastErr"));
       return element;
    }
	
	//Forecast Error last 3 months - Textbox
	public static WebElement fsl_forecast_error_last_3_monts(WebDriver driver)
    {
       element = driver.findElement(By.id("tbHistForecastErrLastThreeMonths"));
       return element;
    }
	
	//Forecast bias - Textbox
	public static WebElement fsl_forecast_bias(WebDriver driver)
    {
       element = driver.findElement(By.id("tbHistForecastBias"));
       return element;
    }
	
	//Forecast bias last 3 months - Textbox
	public static WebElement fsl_forecast_bias_last_3_months(WebDriver driver)
    {
       element = driver.findElement(By.id("tbHistForecastBiasLastThreeMonths"));
       return element;
    }
	
	//% of forecasts - Textbox
	public static WebElement fsl_percent_of_forecasts(WebDriver driver)
    {
       element = driver.findElement(By.id("tbPercentForecastsActualSales"));
       return element;
    }
	
	//Average monthly sales - Textbox
	public static WebElement fsl_average_monthly_sales(WebDriver driver)
    {
       element = driver.findElement(By.id("tbAverageMonthlySales"));
       return element;
    }
	
	//Average monthly forecast - Textbox
	public static WebElement fsl_average_monthly_forecast(WebDriver driver)
    {
       element = driver.findElement(By.id("tbAverageMonthlyForecast"));
       return element;
    }
	
	//Forecast value added - Textbox
	public static WebElement fsl_forecast_value_added(WebDriver driver)
    {
       element = driver.findElement(By.id("tbForecastValueAdded"));
       return element;
    }
	
	//Forecast value added last3 months - Textbox
	public static WebElement fsl_forecast_value_added_last_3_months(WebDriver driver)
    {
       element = driver.findElement(By.id("tbForecastValAddLastThreeMonths"));
       return element;
    }
	
	//***** Statistical forecast for this item *****
	//Demand pattern - Textbox
	public static WebElement fsl_demand_pattern(WebDriver driver)
    {
       element = driver.findElement(By.id("tbDemandPattern"));
       return element;
    }
	
	//Best fit algorithm - Textbox
	public static WebElement fsl_best_fit_algorithm(WebDriver driver)
    {
       element = driver.findElement(By.id("tbBestFitAlgorithm"));
       return element;
    }
	
	//Historical error for this algorithm - Textbox
	public static WebElement fsl_historical_error_statistical(WebDriver driver)
    {
       element = driver.findElement(By.id("tbHistoricalPercentErr"));
       return element;
    }
	
	//Historical error for this algorithm last 3 months - Textbox
	public static WebElement fsl_historical_error_last_3_months_statistical(WebDriver driver)
    {
       element = driver.findElement(By.id("tbHistLastThreeMonths"));
       return element;
    }
	
	//Historical % error for this algorithm - Textbox
	public static WebElement fsl_historical_percent_error(WebDriver driver)
    {
       element = driver.findElement(By.id("tbHistoricalPercentError"));
       return element;
    }
	
	//Historical % error for this algorithm last 3 months - Textbox
	public static WebElement fsl_historical_percent_error_last_3_months(WebDriver driver)
    {
       element = driver.findElement(By.id("tbHPELastThreeMonth"));
       return element;
    }
	
	//Algorithm - Select Box
	public static WebElement fsl_algorithm(WebDriver driver)
    {
       element = driver.findElement(By.id("ddlAlgorithm"));
       return element;
    }
	
	//Algorithm % change - Textbox
	public static WebElement fsl_algorithm_percent_change(WebDriver driver)
    {
       element = driver.findElement(By.id("tbAlgorithmPercentChange"));
       return element;
    }
	
	//***** Data to display on the chart *****
	//History, budget and target - Listbox
	public static WebElement fsl_history_budget_target(WebDriver driver)
    {
       element = driver.findElement(By.id("lstBudgetTarget"));
       return element;
    }
	
	//Show my products and customers - Checkbox
	public static WebElement fsl_show_my_products_customers(WebDriver driver)
    {
       element = driver.findElement(By.id("chkShowMyProducts"));
       return element;
    }
	
	//Select product then customer - Radio button
	public static WebElement fsl_select_prodcut_then_customer(WebDriver driver)
    {
       element = driver.findElement(By.id("rdSelectProduct"));
       return element;
    }
	
	//Select customer then product - Radio button
	public static WebElement fsl_select_customer_then_product(WebDriver driver)
    {
       element = driver.findElement(By.id("rdSelectSales"));
       return element;
    }
	
	
	//***** Product Replacement *****
	//Product Replaces - Dropdown
	public static WebElement fsl_product_replaces(WebDriver driver)
    {
       element = driver.findElement(By.id("ddlProductReplaces"));
       return element;
    }
	
	//Move right - Button
	public static WebElement fsl_product_replaces_move_right(WebDriver driver)
    {
       element = driver.findElement(By.id("btnMoveFwd"));
       return element;
    }
	
	//Move Left - Button
	public static WebElement fsl_product_replaces_move_left(WebDriver driver)
    {
       element = driver.findElement(By.id("btnRemove"));
       return element;
    }
	
	//Selected products - Listbox
	public static WebElement fsl_product_replaces_right_box(WebDriver driver)
    {
       element = driver.findElement(By.id("lstSubtitudeProduct"));
       return element;
    }
	
	//Save button
	public static WebElement fsl_product_replaces_save(WebDriver driver)
    {
       element = driver.findElement(By.id("btnSubtitudeProduct"));
       return element;
    }
	
	//Bottom - Data Grid

	
	//Go to Previous Year - button
	public static WebElement fsl_previous_year(WebDriver driver)
    {
       element = driver.findElement(By.id("BtnPrev"));
       return element;
    }
	
	//Go to Next Year - button
	public static WebElement fsl_next_year(WebDriver driver)
    {
       element = driver.findElement(By.id("BtnNext"));
       return element;
    }
	
	//Reset Forecast - Button
	public static WebElement fsl_reset_forecast(WebDriver driver)
    {
       element = driver.findElement(By.id("btnResetForecast"));
       return element;
    }
	
	//Statistical Forecast - Button
	public static WebElement fsl_statistical_forecast(WebDriver driver)
    {
       element = driver.findElement(By.id("btnStatisticalForecast"));
       return element;
    }
	
	//Save and Next - Button
	public static WebElement fsl_save_next(WebDriver driver)
    {
       element = driver.findElement(By.id("btnSaveNext"));
       return element;
    }
	
	//Save - Button
	public static WebElement fsl_save(WebDriver driver)
    {
       element = driver.findElement(By.id("btnSave"));
       return element;
    }
	
	//Save - Button
	public static WebElement fsl_exit(WebDriver driver)
    {
       element = driver.findElement(By.id("btnExit"));
       return element;
    }
	
	//Enter a comment - Button
	public static WebElement fsl_comment(WebDriver driver)
    {
       element = driver.findElement(By.id("btnComment"));
       return element;
    }
	
	//Review Comment - button
	public static WebElement fsl_review_comment(WebDriver driver)
    {
       element = driver.findElement(By.id("btnRvwComment"));
       return element;
    }
	
	//***** Download Sales Forecasts *****
	
	//Download Sales Forecasts - Menu
	public static WebElement dsf_menu(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_miDownloadSalesForecast"));
       return element;
    }
		
	//Download all Forecast - Button
	public static WebElement dsf_download_all_forecasts(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnDownloadAll"));
       return element;
    }
	
	//Version to download - Dropdown
	public static WebElement dsf_version_to_download(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_ddlVersion"));
       return element;
    }
	
	//Product category - Listbox
	public static WebElement dsf_product_category(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_listProductcategory"));
       return element;
    }
	
	//Product category Selected items- Listbox
	public static WebElement dsf_product_category_selected(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_listselectedProductcategory"));
       return element;
    }
	
	//Product Category Move to right - Button
	public static WebElement dsf_product_category_move_right(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnMoveFwd"));
       return element;
    }
	
	//Product Category Move to right ALL - Button
	public static WebElement dsf_product_category_move_right_all(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnMovefwdall"));
       return element;
    }
	
	//Product Category Move to left - Button
	public static WebElement dsf_product_category_move_left(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnmovBack"));
       return element;
    }
	
	//Product Category Move to left ALL - Button
	public static WebElement dsf_product_category_move_left_all(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnallBack"));
       return element;
    }
	
	
	//Customers - Listbox
	public static WebElement dsf_customers(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_listSalesArea"));
       return element;
    }
	
	//Customers Selected items- Listbox
	public static WebElement dsf_customers_selected(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_listselectSalesArea"));
       return element;
    }
	
	//Customers Move to right - Button
	public static WebElement dsf_customers_move_right(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnMoveSelectfwd"));
       return element;
    }
	
	//Customers Move to right ALL - Button
	public static WebElement dsf_customers_move_right_all(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnMoveallfwd"));
       return element;
    }
	
	//Customers Move to left - Button
	public static WebElement dsf_customers_move_left(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnMoveselectBack"));
       return element;
    }
	
	//Customers Move to left ALL - Button
	public static WebElement dsf_customers_move_left_all(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnMovebackall"));
       return element;
    }
	
	
	//Format to download - Dropdown
	public static WebElement dsf_format_to_download(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_ddlVolumeIndicator"));
       return element;
    }
	
	//Download all company products and customers - Checkbox 
	public static WebElement dsf_download_all_company_products_customers(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_chkShowAllProducts"));
       return element;
    }
	
	//Sales period start - Dropdown
	public static WebElement dsf_sales_period_start(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_ddlFromDate"));
       return element;
    }
	
	//Sales period end - Dropdown
	public static WebElement dsf_sales_period_end(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_ddlToDate"));
       return element;
    }
	
	//Download forecast (with selected items) - Button
	public static WebElement dsf_download(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnDownload"));
       return element;
    }
	
	//********************* Manage Forecasting Groups ********************************
	//Manage Forecasting Groups - Menu
	public static WebElement mfg_menu(WebDriver driver)
    {
       element = driver.findElement(By.id("menuItemHilite26"));
       return element;
    }
	
	//Manage Forecasting Groups - Menu
	public static WebElement mfg_add_forecasting_groups(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_imgAddForecastingGps"));
       return element;
    }
	
	//Manage Forecasting Groups - Menu
	public static WebElement mfg_edit_forecasting_groups(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_imgEditForecastingGps"));
       return element;
    }
	
	//Manage Forecasting Groups - Menu
	public static WebElement mfg_manually_allocate_groups(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_imgManuallyAllocate"));
       return element;
    }
	
	//Manage Forecasting Groups - Menu
	public static WebElement mfg_upload_allocations(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_imgUploadAllocation"));
       return element;
    }
	
	//Forecast group name - Textbox 
	public static WebElement mfg_forecast_group_name(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_fstGroup_Group" + String.format(Integer.parseInt(commonLibrary.curTableRow) + "_txtGroupName")));
       return element;
    }
	
	//Forecast group description - Textbox 
	public static WebElement mfg_forecast_group_description(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_fstGroup_Group" + String.format(Integer.parseInt(commonLibrary.curTableRow) + "_txtDescription")));
       return element;
    }
	
	//Manage Forecasting Groups Save - Button
	public static WebElement mfg_add_groups_save(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnSaveGroup"));
       return element;
    }
	
	//Manage Forecasting Groups Edit Save - Button
	public static WebElement mfg_add_groups_edit_save(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_btnEditGroups"));
       return element;
    }
	
	//Move Up - Image 
	public static WebElement mfg_forecast_group_move_up(WebDriver driver)
    {
       element = driver.findElement(By.id("ctl00_ContentMenu_gvEditGroups_ctl" + String.format("%02d", (01 + Integer.parseInt(commonLibrary.curTableRow))) + "_imgUpArrow"));
       return element;
    }
	
	//Move Down - Image
	public static WebElement mfg_forecast_group_move_down(WebDriver driver)
    {
		element = driver.findElement(By.id("ctl00_ContentMenu_gvEditGroups_ctl" + String.format("%02d", (01 + Integer.parseInt(commonLibrary.curTableRow))) + "_btnDown"));
       return element;
    }
	//Answer your security question - .//*[@id='view_container']/form/div[2]/div/div/div/ul/li[1]/div/div[2]
	//Enter the city you usually sign in from - .//*[@id='view_container']/form/div[2]/div/div/div/ul/li[2]/div/div[2]
	//Get Help - .//*[@id='recoveryBumpPickerEntry']/div[2]
	//Try a different question - .//*[@id='skipChallenge']
	//Enter your answer - .//*[@id='answer']

	//Confirm your recovery email - .//*[@id='view_container']/form/div[2]/div/div/div/ul/li[4]/div/div[2]
	//input box - .//*[@id='knowledge-preregistered-email-response']
	//Next - .//*[@id='next']/content/span
}
