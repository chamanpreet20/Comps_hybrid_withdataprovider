package operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
// no change in this file 
public class Readobject {
	Properties p=new Properties();
	public Properties getobjectrepository() throws IOException
	{
		File src=new File("C://Users//chaman.preet//Documents//C data//git//CompsBuilder_final//src//objects//object.properties");
		FileInputStream fs=new FileInputStream(src);
		p.load(fs);
	//	p.setProperty("managecomps", "MANAGE COMPS");
	// upload comps by sweta 
		p.setProperty("submitbtn","button.blueButton.UtSubmit");
		p.setProperty("filename","//div[@id='collapse5']//div//div//div//table//tbody//tr[2]//td");
		p.setProperty("backupfileText","//div[@id='collapse4']//div//div//div//table//tbody//tr[2]//td" );
		p.setProperty("UploadcompsTab","Upload Comps");
		p.setProperty("upload","attachment");
		p.setProperty("uploadbackup","BackupAttachment");
		p.setProperty("bkupsbmtbtn","button.blueButton.BackUpSubmit");
		p.setProperty("recently","Recently Uploaded");
		p.setProperty("testcase","test case closed ");
		p.setProperty("msg","td.Message>span");


		
			
				
		// download comps project properties chaman 
		p.setProperty("managecomps", "MANAGE COMPS");
		p.setProperty("Team_arrow", "//span[@aria-owns='drp_Team_listbox']");
		p.setProperty("Team_select", "//div[@class='k-list-scroller']//ul[@id='drp_Team_listbox']//li[@data-offset-index='0']");
		p.setProperty("Template_arrow", "//span[@aria-owns='drp_Template_listbox']");
		p.setProperty("Template_select","//div[@class='k-list-scroller']//ul[@id='drp_Template_listbox']//li[text()='NY']");
		p.setProperty("UploadcompsTab", "Upload Comps");
		p.setProperty("upload", "attachment");
		p.setProperty("Sector_select", "//div[@class='k-list-scroller']//ul[@id='drp_Sector_listbox']/li[@data-offset-index='0']");
		p.setProperty("Subsector_arrow", "(//div[@class='k-multiselect-wrap k-floatwrap'])[1]");
		p.setProperty("Subsector_select", "//div[@class='k-list-scroller']//ul[@id='MulSel_SubSector_listbox']//li[text()='Retail']");
		p.setProperty("Portfolio_arrow", "(//div[@class='k-multiselect-wrap k-floatwrap'])[2]");
		p.setProperty("Portfolio_Select", "//div[@class='k-list-scroller']//ul[@id='MulSel_Portfolio_listbox']//li[text()='Apparel Manufacturers']");
		p.setProperty("Select_pages", "//div[@id='selectallpages']");
		p.setProperty("Subsector_select2","//div[@class='k-list-scroller']//ul[@id='MulSel_SubSector_listbox']//li[text()='Consumer']" );
		p.setProperty("Portfolio_Select2", "//div[@class='k-list-scroller']//ul[@id='MulSel_Portfolio_listbox']//li[text()='Agribusiness']");
		p.setProperty("Remove_portfolio", "(//span[@class='k-icon k-i-close'])[2]");
		p.setProperty("count_message", "//div[@class='k-pager-wrap k-grid-pager k-widget k-floatwrap']//span[@class='k-pager-info k-label']");
		p.setProperty("search_company", "atc_Company");
		p.setProperty("Secondmulti_blank", "(//div[@class='k-multiselect-wrap k-floatwrap']//input[@class='k-input k-readonly'])[2]");
		//p.setProperty("company_select", "//div[@class='k-list-scroller']//ul[@id='atc_Company_listbox']//li[text()='Advance Auto Parts, Inc.---AAP-US---Is Active']");
		p.setProperty("add_button", "btn_DOWNLOAD");
		p.setProperty("company_select","//div[@class='k-list-scroller']//ul[@id='atc_Company_listbox']//li[@data-offset-index='0']");
		p.setProperty("dialog", "//div[@class='ajs-dialog']//div[@class='ajs-content']//li");
		p.setProperty("close_dialog", "(//div[@class='ajs-dialog']//div[@class='ajs-primary ajs-buttons']//button[@class='ajs-button ajs-ok'])[1]");
		p.setProperty("reset_download","btn_reset");
		p.setProperty("reset_alert", "//div[@class='ajs-dialog']//div[@class='ajs-header']");
		p.setProperty("reset_yes", "//div[@class='ajs-dialog']//div[@class='ajs-primary ajs-buttons']//button[@class='ajs-button ajs-ok']");
		p.setProperty("success_temp_msg", "//div[@class='ajs-message ajs-success ajs-visible']");
		p.setProperty("Team_blank", "//span[@aria-owns='drp_Team_listbox']//span[@class='k-input']");
		p.setProperty("Template_blank", "//span[@aria-owns='drp_Template_listbox']//span[@class='k-input']");
		p.setProperty("Sector_blank", "//span[@aria-owns='drp_Sector_listbox']//span[@class='k-input']");
		p.setProperty("Firstmulti_blank", "(//div[@class='k-multiselect-wrap k-floatwrap']//input[@class='k-input k-readonly'])[1]");
		p.setProperty("company_blank", "//span[@class='k-widget k-autocomplete k-header k-state-default']//input[@id='atc_Company']");
		p.setProperty("form_click", "//div[@id='Login']");
		p.setProperty("table_rows", "//*[@id='grid']/div[2]/table/tbody/tr");
		
		
		
			
	//List of companies section sweta started from here 
		p.setProperty("allcheckbox_grid", "html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[2]//input[@type='checkbox']");
		p.setProperty("single_checkbox","html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[2]/table/tbody/tr[4]/td[1]/input");
		p.setProperty("header_checkbox","html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[1]/div/table/thead/tr/th[1]/input");
		p.setProperty("select_All_page_chkbx","checkbox1");
		p.setProperty("btn_checkbox","//div[@class='table']//div[@class='k-grid-content']//input[@type='checkbox']");
		p.setProperty("deselect_checkbox", "html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[2]/table/tbody/tr[4]/td[1]");
		p.setProperty("select_all_btn","html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[1]/div/table/thead/tr/th[1]/input");
	//backup view ..company do not have any backup file
		p.setProperty("View_Bckup", "//tr[@id='188']/td[11]/a/span");
		p.setProperty("view_alert_text", "div.ajs-content > li");
		p.setProperty("CloseViewBckupAlert", "button.ajs-button.ajs-ok");
	//backup view ..company  have a backup files
		p.setProperty("BckupViewWithFiles", "//tr[@id='192']/td[11]/a/span");
		p.setProperty("bckup_View_alert_file_txt","//span[@id='RecentlyBackupShowModal_wnd_title']/h4");
		p.setProperty("CloseBackupfileWindow", "//div[17]/div/div/a/span");
	// download button without any backup file 
		p.setProperty("dwnld_with_no_file", "span.wxy.k-icon");
		p.setProperty("dwnld_text_with_no_file", "div.ajs-content > li");
		p.setProperty("close_dwnld_alert_with_no_file", "button.ajs-button.ajs-ok");
	// download button  backup file 
		p.setProperty("downloadBckupFile", "//tr[@id='189']/td[11]/a[2]/span");	
	//delete from comps manage download
		p.setProperty("text_attribute", "span[title='PVH Corp.']");
		p.setProperty("delete_compny_btn","//tr[@id='194']/td[11]/a[3]/span");	
	//lock company from mange comps>download 
		p.setProperty("Lock_company","html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[2]/table/tbody/tr[8]/td[11]/a[4]/span");
		p.setProperty("lock_confirm_yes_btn","html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]");
	//Verification- Only downloaded company can be locked
		p.setProperty("lock_undwnld_company","html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[2]/table/tbody/tr[15]/td[11]/a[4]/span");
		p.setProperty("txt_on_alert_lck_undwnld_cmpny","div.ajs-content > li");
		p.setProperty("yes_btn_undwnld_cmpny_cant_lck","html/body/div[19]/div[2]/div/div[1]/button[3]");
	//paging by sweta
		p.setProperty("paging_txt","span.k-pager-info.k-label");
	// recently downloaded icon
		p.setProperty("recntly_dwnld","Recently Downloaded");
		p.setProperty("text_recntly_dwnld_popup","html/body/div[17]/div[1]/span/h4");
		p.setProperty("headername", "html/body/div[17]/div[2]/div/div/div[1]/div/div/div[1]/div/table/thead/tr");
	//data verification 
		p.setProperty("Portfolio_Select1","//div[@class='k-list-scroller']//ul[@id='MulSel_Portfolio_listbox']//li[text()='Diversified category killers']");
		p.setProperty("select_row_dwnld_company","html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[2]/table/tbody/tr[7]/td[1]/input");
		p.setProperty("download_icon","btn_downShortlistedModal");
		p.setProperty("downloadcomps_popup_btn","DownloadComps");
		p.setProperty("txt_of_dwnld_compy","span[title='Michaels Companies Inc']");
	//verify data
		p.setProperty("bs_source","html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[2]/table/tbody/tr[7]/td[8]");
		p.setProperty("updated_by","html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[2]/table/tbody/tr[7]/td[9]");
		p.setProperty("updated_date","html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[2]/table/tbody/tr[7]/td[7]");
		p.setProperty("filling_date","html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[2]/table/tbody/tr[7]/td[6]");
		p.setProperty("template_name","html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[2]/table/tbody/tr[7]/td[5]");
	//Review Shortlisted Download Companies on popup
		 p.setProperty("allcheckbox", "html/body/div[18]/div[2]/div/div/div[1]/div/div/div[2]//input[@type='checkbox']");
		 p.setProperty("select_all_chkbx_popup","checkAll_Modal");
		 p.setProperty("single_checkbox_popup","html/body/div[18]/div[2]/div/div/div[1]/div/div/div[2]/table/tbody/tr[3]/td[1]/input");
		 p.setProperty("header_checkbox_popup","html/body/div[18]/div[2]/div/div/div[1]/div/div/div[1]/div/table/thead/tr/th[1]/input");
	//delete companies Review Shortlisted Download Companies on popup
		 p.setProperty("dlt_cmpny_txt","html/body/div[18]/div[2]/div/div/div[1]/div/div/div[2]/table/tbody/tr[10]/td[2]/span");
		 p.setProperty("dlt_cmpny_icon","//div[@id='grid_modal']/div[2]/table/tbody/tr[10]/td[9]//a[@class='k-button k-button-icontext k-grid-delete']");
		 p.setProperty("countOfCompany","//div[@id='grid_modal']/div[3]/span");
		 p.setProperty("table_body","html/body/div[18]/div[2]/div/div/div[1]/div/div/div[2]");
		
	//pagging on popup companies Review Shortlisted Download Companies on popup
		  p.setProperty("txt_paging_popup","span.k-pager-info.k-label");
    //Lock view in Review Shortlisted Download Companies on popup
		 p.setProperty("dwnld_cmpny","html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[2]/table/tbody/tr[9]/td[1]/input");
		 p.setProperty("txt_compny_popup","html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[2]/table/tbody/tr[9]/td[3]/span");
		 p.setProperty("row","html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[2]/table/tbody/tr[9]/td[3]");
		    			
	//List of companies section sweta ended here 
		
		
		
		 
		 
		 // Trading Comps by Chaman 
		    p.setProperty("Trading_Portfolio_arrow", "(//div[@class='k-multiselect-wrap k-floatwrap'])[3]");
			p.setProperty("info_icon", "//a[@class='glyphicon glyphicon-info-sign blue']");
			p.setProperty("info_dialog_heading", "//div[@class='modal-dialog']//h4[@class='modal-title size18 pink font-bold']");
			p.setProperty("info_close", "//div[@class='modal-dialog']//button[@class='close']");
			p.setProperty("companysame_dialog", "//div[@class='ajs-dialog']//div[@class='ajs-content']//li");
			p.setProperty("Thirdmulti_blank", "(//div[@class='k-multiselect-wrap k-floatwrap']//input[@class='k-input k-readonly'])[3]");
			p.setProperty("Trading_Select_pages", "//div[@id='divwithgrid']//input[@onclick='checkAllPages(this)']");
			p.setProperty("Reset_link", "//a[@onclick='Reset()']");
			p.setProperty("Reset_button", "//input[@type='button'][@value='RESET']");
			p.setProperty("Delete_button", "//input[@value='DELETE']");
			p.setProperty("Trading_firstcompany", "//*[@id='grid']/div[2]/table/tbody/tr[1]/td[2]/span");
			p.setProperty("Trading_clkfirstcompany", "//*[@id='grid']/div[2]/table/tbody/tr[1]/td[1]/input");
			p.setProperty("Trading_clksixthcompany", "//*[@id='grid']/div[2]/table/tbody/tr[6]/td[1]/input");
			p.setProperty("Next_button", "//input[@type='button'][@value='NEXT']");
			p.setProperty("preview_output", "//span[@tabname='Output']");
			p.setProperty("Portfolio_auto", "//div[@class='k-list-scroller']//ul[@id='MulSel_Portfolio_listbox']//li[text()='Auto parts']");
			p.setProperty("Portfolio_airlines", "//div[@class='k-list-scroller']//ul[@id='MulSel_Portfolio_listbox']//li[text()='Airlines']");
			p.setProperty("template_dialog_value1", "//div[@class='table size12']");
			p.setProperty("template_dialog_value2", "//div[@class='table size12']//input[2]");
			p.setProperty("template_dialog_value3", "//div[@class='table size12']//input[3]");
			p.setProperty("dialog_button", "PortfolioGenerateOutput");
			p.setProperty("Template_select_dialog", "//span[@id='PortfolioModal_wnd_title']//h4");
			p.setProperty("template_third_click", "//div[@class='table size12']//input[3]");
			p.setProperty("download_comps", "//input[@value='DOWNLOAD COMPS']");
		    p.setProperty("Trading_heading", "//h1[text()='Pre-defined Comps']");
				 

		// trading comps by rajeev 
				
			p.setProperty("menu_TradingComps","html/body/div[1]/div[2]/div[1]/ul/li[1]/a");
			p.setProperty("submenu_SelectCompanyProfile",".//*[@id='selectcompany']/a");
			p.setProperty("rad_companyticker",".//*[@id='accordion']/div[1]/div/section[1]/div[1]/label");
			p.setProperty("txt_companysearch",".//*[@id='atc_Company']");
			p.setProperty("drpsearchvalue_test",".//*[@id='atc_Company_listbox']/li");
			p.setProperty("grid_testcompany",".//*[@id='smallgrid']/div[2]/table/tbody/tr/td[4]/a");
			p.setProperty("rad_subsectorPortfolia",".//*[@id='accordion']/div[1]/div/section[1]/div[2]/label");
			p.setProperty("txt_subsectorportfolio",".//*[@id='atc_Portfolio']");
			p.setProperty("drp_sector",".//*[@id='accordion']/div[1]/div/section[5]/div[1]/div/div");
			p.setProperty("drpclickedvalue_Consumer_sector","//div[@class='k-list-scroller']//ul[@id='drp_Sector_listbox']//li[text()='Consumer']");
			p.setProperty("drp_subsector",".//*[@id='div_MulSel_SubSector']/div/div");
			p.setProperty("drpclickedvalue_retail_subsector","//div[@class='k-list-scroller']//ul[@id='MulSel_SubSector_listbox']//li[text()='Retail']");
			p.setProperty("drpclickedvalue_consumer_subsector","//div[@class='k-list-scroller']//ul[@id='MulSel_SubSector_listbox']//li[text()='Consumer']");
			p.setProperty("drp_portfolio",".//*[@id='accordion']/div[1]/div/section[5]/div[3]/div/div");
			p.setProperty("drp_opensymbol",".//*[@id='MulSel_Portfolio_taglist']/li/span[2]/span/text()");
			p.setProperty("drpclickedvalue_portfolio_airline","//div[@class='k-list-scroller']//ul[@id='MulSel_Portfolio_listbox']//li[text()='Airlines']  ");
			p.setProperty("drpclickedvalue_portfolio_Apparel","//div[@class='k-list-scroller']//ul[@id='MulSel_Portfolio_listbox']//li[text()='Agribusiness']");
			p.setProperty("paging_leftgrid",".//*[@id='portfoliogrid']/div[3]/span");

// Manoj Trading Comps and manage Comps started from here 
		
		p.setProperty("grid_portfolio_count", ".//*[@id='portfoliogrid']/div[3]/span");
		p.setProperty("drpclickedvalue_portfolio_autoparts", ".//*[@id='MulSel_Portfolio_listbox']/li[4]");
		p.setProperty("slc_count", "//*[@id='grid']//div[3]//span[@class='k-pager-info k-label']");
		p.setProperty("grid_portfolio1"," //*[@id='portfoliogrid']//div[2]//table//tbody//tr[1]//td[3]");
		p.setProperty("grid_btn_delete", ".//*[@id='portfoliogrid']/div[2]/table/tbody/tr[2]/td[5]/a ");
		p.setProperty("grid_s_portfolio_cnt"," html/body/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div[3]/span ");
		p.setProperty("drp_clicked_apprel", ".//*[@id='MulSel_Portfolio_listbox']/li[3]");;
		p.setProperty("cmpny_searchBox", "//*[@id='atc_Company']");
		p.setProperty("cmpny_rad_btn", "//*[@id='accordion']//div[1]//div//section[1]//div[1]//label");
		p.setProperty("cmpny_drp_acco", ".//*[@id='atc_Company_listbox']/li[1]");
		p.setProperty("cmpny_name_verify", ".//*[@id='smallgrid']/div[2]/table/tbody/tr/td[3]/a");
		p.setProperty("cmpny_drp_batobbaco_mal", "//*[@id='atc_Company_listbox']//li[2]");
		p.setProperty("cmpny_listbox", ".//*[@id='atc_Portfolio']");
		p.setProperty("subsector_rad_btn", "//*[@id='accordion']//div[1]//div//section[1]//div[2]//label");
		p.setProperty("cmpny_drp_retailapprel", "//div[@class='k-list-scroller']//ul[@id='atc_Portfolio_listbox']//li[@data-offset-index='0']");
		p.setProperty("Comp_name_verify", "//*[@id='smallgrid']//div[2]//table//tbody//tr//td[4]//a");
		p.setProperty("Comp_name_verify_pt", "//*[@id='smallgrid']//div[2]//table//tbody//tr//td[3]//a");
		p.setProperty("cmpny_name_verify_rt", "=.//*[@id='grid']/div[2]/table/tbody/tr/td[2]/span");
		p.setProperty("cmpny_name_cleanwtr", "//*[@id='atc_Company_listbox']/li[1]");
		p.setProperty("shrtlsted_cmpny_del", ".//*[@id='grid']/div[2]/table/tbody/tr/td[7]/a/span");
		p.setProperty("cmpny_name_grid", ".//*[@id='smallgrid']//td[@title='ACCO Brands Corporation']/a ");
		p.setProperty("cmpny_search_subsector", "atc_Portfolio");
		p.setProperty("cmpny_search_cmpny", ".//input[@id='atc_Company' and @name='atc_Company']");
		p.setProperty("cmpny_nt_btn", "//*[@id='tab1']/div[5]/input[2]");
		p.setProperty("nxt_page_image1", "Output_1");
		p.setProperty("image_close_btn", "html/body/div[14]/div[1]/div/a/span");
		p.setProperty("url", "http://evs01tst05/CompsBuilderTest/ ");
		p.setProperty("username", "UserName");
		p.setProperty("password", "Password");
		p.setProperty("cmpny_selected_carter", ".//*[@id='187']/td[1]/input");
		p.setProperty("dwnld_btn", ".//*[@id='btn_downShortlistedModal']");
		p.setProperty("dwnld_btn_1", "DownloadComps");
		p.setProperty("cmpny_selected_GILDAN", ".//*[@id='190']/td[1]/input");
		p.setProperty("dwnld_backup", ".//*[@id='DownloadBackups']");
		p.setProperty("comp_count", "//*[@id='grid']//div[3]//span[@class='k-pager-info k-label']");
		p.setProperty("shrtlsted_cmpny_name", ".//*[@id='grid']/div[2]/table/tbody/tr/td[2]/span");
		p.setProperty("result_cmpny", ".//*[@id='smallgrid']/div[2]/table/tbody/tr/td[4]/a"); 
        p.setProperty("drpclickedvalue_portfolio_boardline", "//div[@class='k-list-scroller']//ul[@id='MulSel_Portfolio_listbox']//li[text()='Broadline discounters']");

// Trading comps Common test cases Sweta 
         
		p.setProperty("Select_all_page_chkbx_trading","checkbox1");
		p.setProperty("allchkbxinGrid","//div[@id='grid']/div[2]/table//input[@type='checkbox']");
		p.setProperty("company_name", "html/body/div[8]/div/div[2]/ul/li");
		p.setProperty("bs_source_trading", "//div[@id='grid']/div[@class='k-grid-content']/table/tbody/tr/td[3]");
		p.setProperty("updated_date_trading","//div[@id='grid']/div[@class='k-grid-content']/table/tbody/tr/td[5]");
		p.setProperty("filling_date_trading","//div[@id='grid']/div[@class='k-grid-content']/table/tbody/tr/td[4]");
		p.setProperty("paging_txt_trading", "//div[@id='grid']/div[3]/span");
		p.setProperty("Portfolio_familyDining", "//div[@class='k-list-scroller']//ul[@id='MulSel_Portfolio_listbox']//li[text()='Family Dining']");
		p.setProperty("Portfolio_Diversified","//div[@class='k-list-scroller']//ul[@id='MulSel_Portfolio_listbox']//li[text()='Diversified category killers']");
		return p;
		}
}
