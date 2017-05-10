function transformation()
{
    var result = new java.util.LinkedHashMap();
    var a = [];
    var b = [];
    var x = standard.view.web_pagecat_source.cus_url_np_ti_all_concat;
    var url_length = 0;
    var url_length_prev = 0;
    var urlback="";
    for (i = 1; i <= 51; i++)
    {
        a[i] = "";
        b[i - 1] = 0;
    }

    if (typeof x !== 'undefined')
    {
        urls = x.split("|||");
        url_length = urls.length;
        url_length_prev = urls.length - 1;

        for (i = 0; i < urls.length; i++)
        {
            var pageCat = "";
            var url = "";
            url = urls[i].split("##")[0];
//            title = urls[i].split("##")[2];
//            url = url + '##' + title;
urlback=url;
            if (url.equals('http://www.grainger.com/') || url.equals('https://www.grainger.com/') || url.equals('www.grainger.com')) {
                pageCat = 'grainger_homepage';
            }
            else {
                if (x != null)
                {
                    //Replace all stopwords with empty string
                      
                    url = url.replace(/\P{Print}/gi, "");
                    url = url.replace(/\.grainger\.com/gi, "");
                    url = url.replace(/grainger\.com/gi, "");
                    url = url.replace(/grainger/gi, "");
                   url=url.replace(/ /g,"");
                    url = url.replace(/www\./gi, "");
                    url = url.replace(/www/gi, "");
                    url = url.replace(/\.jsf/gi, "");
                    url = url.replace(/\.do/gi, "");
                    url = url.replace(/\.aspx/gi, "");
                    url = url.replace(/\.asp/gi, "");                    
                    url = url.replace(/-/gi, " ");
                     url = url.replace(/\.html/gi, "");
                    url = url.replace(/\.htm/gi, "");
                    url = url.replace(/http:\/\//gi, "");
                    url = url.replace(/https:\/\//gi, "");
                    url = url.replace(/_/gi, "");
                     url = url.replace(/\?.*$/gi, "");
                     url = url.replace(/[&~{}\[\]]/gi, "");
                     url = url.replace(/'/gi, "");
                      url = url.replace(/\//gi, " ");                     
                    //url = url.replace(/|/gi, " ");
                    
               

                    //Replace all tokens with space

                    url = url.toLowerCase().trim();
                    url = url.replace(/[/#|]/gi, " ");
                    //When url, navpath and title are being used
                    url = url.replace(/##/g, " ");

                    //Page Categorization regex

                    if (url != "")
                    {

                        if (url.match(/^(?=.*\becatalog\b)(?=.*\bcategory\b)(?=.*\bsafety\b).*$/gi)) {
                            pageCat = 'ecatalog_and_category_and_safety';
                            b[0]++;
                        }
                        else if (url.match(/^(?=.*\becatalog\b)(?=.*\bcategory\b)(?=.*\belectrical\b).*$/gi)) {
                            pageCat = 'ecatalog_and_category_and_electrical';
                            b[1]++;
                        }
                        else if (url.match(/^(?=.*\becatalog\b)(?=.*\bcategory\b)(?=.*\bmaterialhandling\b).*$/gi)) {
                            pageCat = 'ecatalog_and_category_and_materialhandling';
                            b[2]++;
                        }
                        else if (url.match(/^(?=.*\becatalog\b)(?=.*\bcategory\b)(?=.*\bhandtools\b).*$/gi)) {
                            pageCat = 'ecatalog_and_category_and_handtools';
                            b[3]++;
                        }
                        else if (url.match(/^(?=.*\becatalog\b)(?=.*\bcategory\b)(?=.*\bplumbing\b).*$/gi)) {
                            pageCat = 'ecatalog_and_category_and_plumbing';
                            b[4]++;
                        }
                        else if (url.match(/^(?=.*\becatalog\b)(?=.*\bcategory\b)(?=.*\bcleaning\b).*$/gi)) {
                            pageCat = 'ecatalog_and_category_and_cleaning';
                            b[5]++;
                        }
                        else if (url.match(/^(?=.*\becatalog\b)(?=.*\bcategory\b)(?=.*\blighting\b).*$/gi)) {
                            pageCat = 'ecatalog_and_category_and_lighting';
                            b[6]++;
                        }
                        else if (url.match(/^(?=.*\becatalog\b)(?=.*\bcategory\b)(?=.*\bfasteners\b).*$/gi)) {
                            pageCat = 'ecatalog_and_category_and_fasteners';
                            b[7]++;
                        }
                        else if (url.match(/^(?=.*\becatalog\b)(?=.*\bcategory\b)(?=.*\bhvacandrefrigeration\b).*$/gi)) {
                            pageCat = 'ecatalog_and_category_and_hvacandrefrigeration';
                            b[8]++;
                        }
                        else if (url.match(/^(?=.*\becatalog\b)(?=.*\bcategory\b)(?=.*\bpneumatics\b).*$/gi)) {
                            pageCat = 'ecatalog_and_category_and_pneumatics';
                            b[9]++;
                        }
                        else if (url.match(/^(?=.*\becatalog\b)(?=.*\bcategory\b)(?=.*\bpowertools\b).*$/gi)) {
                            pageCat = 'ecatalog_and_category_and_powertools';
                            b[10]++;
                        }
                        else if (url.match(/^(?=.*\bcategory\b)(?=.*\becatalog\b)(?=.*\bn\b)(?=.*\bh9h\b).*$/gi)) {
                            pageCat = 'grainger_hot_buys';
                            b[11]++;
                        }
                        else if ((url.match(/^(?=.*\babrasives\b)(?=.*\becatalog\b)(?=.*\bn\b).*$/gi)) || (url.match(/^(?=.*\braw\b)(?=.*\bmaterials\b)(?=.*\becatalog\b)(?=.*\bn\b).*$/gi))) {
                            pageCat = 'grainger_abraisives_raw_mat';
                            b[12]++;
                        }
                        else if ((url.match(/^(?=.*\badhesives\b)(?=.*\bsealants\b)(?=.*\band\b)(?=.*\btape\b)(?=.*\becatalog\b)(?=.*\bn\b).*$/gi)) || (url.match(/^(?=.*\blubrication\b)(?=.*\becatalog\b)(?=.*\bn\b).*$/gi)) || (url.match(/^(?=.*\boffice\b)(?=.*\bsupplies\b)(?=.*\becatalog\b)(?=.*\bn\b).*$/gi)) || (url.match(/^(?=.*\breference\b)(?=.*\blearning\b)(?=.*\bsupplies\b)(?=.*\becatalog\b)(?=.*\bn\b).*$/gi))) {
                            pageCat = 'grainger_adhesives_lubrication_office_learning';
                            b[13]++;
                        }
                        else if (url.match(/^(?=.*\bfleet\b)(?=.*\band\b)(?=.*\bvehicle\b)(?=.*\bmaintenance\b)(?=.*\becatalog\b)(?=.*\bn\b).*$/gi)) {
                            pageCat = 'grainger_fleet_vehicle_maintenance';
                            b[14]++;
                        }
                        else if ((url.match(/^(?=.*\bfurniture\b)(?=.*\bhospitality\b)(?=.*\band\b)(?=.*\bfood\b)(?=.*\bservice\b)(?=.*\becatalog\b)(?=.*\bn\b).*$/gi)) || (url.match(/^(?=.*\blab\b)(?=.*\bsupplies\b)(?=.*\becatalog\b)(?=.*\bn\b).*$/gi))) {
                            pageCat = 'grainger_furniture_hospitality_food_lab_supplies';
                            b[15]++;
                        }
                        else if ((url.match(/^(?=.*\bhand\b)(?=.*\btools\b)(?=.*\becatalog\b)(?=.*\bn\b).*$/gi)) || (url.match(/^(?=.*\bmachining\b)(?=.*\becatalog\b)(?=.*\bn\b).*$/gi))) {
                            pageCat = 'grainger_hand_tools_machining';
                            b[16]++;
                        }
                        else if (url.match(/^(?=.*\bmaterial\b)(?=.*\bhandling\b)(?=.*\becatalog\b)(?=.*\bn\b).*$/gi)) {
                            pageCat = 'grainger_material_handling';
                            b[17]++;
                        }
                        else if (url.match(/^(?=.*\bpaint\b)(?=.*\bequipment\b)(?=.*\bsupplies\b)(?=.*\becatalog\b)(?=.*\bn\b).*$/gi)) {
                            pageCat = 'grainger_paint_equipment_supplies';
                            b[18]++;
                        }
                        else if ((url.match(/^(?=.*\bpower\b)(?=.*\btransmission\b)(?=.*\becatalog\b)(?=.*\bn\b).*$/gi)) || (url.match(/^(?=.*\bsecurity\b)(?=.*\becatalog\b)(?=.*\bn\b).*$/gi))) {
                            pageCat = 'grainger_power_transmission_security';
                            b[19]++;
                        }
                        else if (url.match(/^(?=.*\bsafety\b)(?=.*\becatalog\b)(?=.*\bn\b).*$/gi)) {
                            pageCat = 'grainger_safety';
                            b[20]++;
                        }
                        else if (url.match(/^(?=.*\bhydraulics\b)(?=.*\becatalog\b)(?=.*\bn\b).*$/gi)) {
                            pageCat = 'grainger_hydraulics';
                            b[21]++;
                        }
                        else if (url.match(/^(?=.*\btest\b)(?=.*\binstruments\b)(?=.*\becatalog\b)(?=.*\bn\b).*$/gi)) {
                            pageCat = 'grainger_test_instruments';
                            b[22]++;
                        }
                        else if (url.match(/^(?=.*\bwelding\b)(?=.*\becatalog\b)(?=.*\bn\b).*$/gi)) {
                            pageCat = 'grainger_welding';
                            b[23]++;
                        }
                        else if (url.match(/^(?=.*\becatalog\b)(?=.*\bcategory\b)(?=.*\bn\b).*$/gi)) {
                            pageCat = 'ecatalog_and_category_and_n';
                            b[24]++;
                        }
                        else if (url.match(/^(?=.*\becatalog\b)(?=.*\bcategory\b)(?=.*\bpumps\b).*$/gi)) {
                            pageCat = 'ecatalog_and_category_and_pumps';
                            b[25]++;
                        }
                        else if (url.match(/^(?=.*\becatalog\b)(?=.*\bcategory\b)(?=.*\bmotors\b).*$/gi)) {
                            pageCat = 'ecatalog_and_category_and_motors';
                            b[26]++;
                        }
                        else if (url.match(/^(?=.*\becatalog\b)(?=.*\bcategory\b)(?=.*\bhardware\b).*$/gi)) {
                            pageCat = 'ecatalog_and_category_and_hardware';
                            b[27]++;
                        }
                        else if (url.match(/^(?=.*\becatalog\b)(?=.*\bcategory\b)(?=.*\boutdoorequipment\b).*$/gi)) {
                            pageCat = 'ecatalog_and_category_and_outdoorequipment';
                            b[28]++;
                        }
                        else if (url.match(/^(?=.*\becatalog\b)(?=.*\bcategory\b).*$/gi)) {
                            pageCat = 'ecatalog_and_category';
                            b[29]++;
                        }
                        else if (url.match(/^(?=.*\becatalog\b)(?=.*\bn\b).*$/gi)) {
                            pageCat = 'ecatalog_and_n';
                            b[30]++;
                        }
                        else if (url.match(/^(?=.*\becatalog\b).*$/gi)) {
                            pageCat = 'ecatalog';
                            b[31]++;
                        }
                        else if (url.match(/^(?=.*\bproduct\b)(?=.*\bn\b).*$/gi)) {
                            pageCat = 'product_and_n';
                            b[32]++;
                        }
                        else if (url.match(/^(?=.*\bproduct\b).*$/gi)) {
                            pageCat = 'product';
                            b[33]++;
                        }
                        else if (url.match(/^(?=.*\bsearch\b).*$/gi)) {
                            pageCat = 'search';
                            b[34]++;
                        }
                        else if ((url.match(/^(?=.*\bcontent\b)(?=.*\brebates\b).*$/gi)) || (url.match(/^(?=.*\bclearance\b).*$/gi))) {
                            pageCat = 'grainger_discount_items';
                            b[35]++;
                        }
                        else if (url.match(/^(?=.*\bcontent\b)(?=.*\bgeneralcatalog\b).*$/gi)) {
                            pageCat = 'content_and_generalcatalog';
                            b[36]++;
                        }
                        else if ((url.match(/^(?=.*\bcontent\b)(?=.*\bhelp\b).*$/gi)) || (url.match(/^(?=.*\bcontent\b)(?=.*\bcustomer\b)(?=.*\bservice\b).*$/gi))) {
                            pageCat = 'grainger_customer_service';
                            b[37]++;
                        }
                        else if (url.match(/^(?=.*\bcontent\b).*$/gi)) {
                            pageCat = 'content';
                            b[38]++;
                        }
                        else if (url.match(/^(?=.*\bcheckout\b)(?=.*\bexpresscheckout\b).*$/gi)) {
                            pageCat = 'checkout_and_expresscheckout';
                            b[39]++;
                        }
                        else if (url.match(/^(?=.*\bcheckout\b).*$/gi)) {
                            pageCat = 'checkout';
                            b[40]++;
                        }
                        else if (url.match(/^(?=.*\bcart\b).*$/gi)) {
                            pageCat = 'cart';
                            b[41]++;
                        }
                        else if (url.match(/^(?=.*\bmyaccount\b)(?=.*\bsignin\b).*$/gi)) {
                            pageCat = 'myaccount_and_signin';
                            b[42]++;
                        }
                        else if (url.match(/^(?=.*\bmyaccount\b)(?=.*\borderhistory\b).*$/gi)) {
                            pageCat = 'myaccount_and_orderhistory';
                            b[43]++;
                        }
                        else if (url.match(/^(?=.*\bmyaccount\b)(?=.*\bcheckoutsignin\b).*$/gi)) {
                            pageCat = 'myaccount_and_checkoutsignin';
                            b[44]++;
                        }
                        else if (url.match(/^(?=.*\bmyaccount\b).*$/gi)) {
                            pageCat = 'myaccount';
                            b[45]++;
                        }
                        else if (url.match(/^(?=.*\bchecklogin\b).*$/gi)) {
                            pageCat = 'checklogin';
                            b[46]++;
                        }
                        else if (url.match(/^(?=.*\bnewproducts\b).*$/gi)) {
                            pageCat = 'grainger_new_products';
                            b[47]++;
                        }
                        else if (url.match(/^(?=.*\bdigicats\b).*$/gi)) {
                            pageCat = 'grainger_digital_catalogs';
                            b[48]++;
                        }
                        else {
                            pageCat = 'others';
                            b[49]++;
                        }


                    }
                }

            }
            a[i + 1] = url+"------"+pageCat+"======="+urlback;
        }
    }

    result.put("page_01_category", a[1]);
    result.put("page_02_category", a[2]);
    result.put("page_03_category", a[3]);
    result.put("page_04_category", a[4]);
    result.put("page_05_category", a[5]);
    result.put("page_06_category", a[6]);
    result.put("page_07_category", a[7]);
    result.put("page_08_category", a[8]);
    result.put("page_09_category", a[9]);
    result.put("page_10_category", a[10]);
    result.put("page_11_category", a[11]);
    result.put("page_12_category", a[12]);
    result.put("page_13_category", a[13]);
    result.put("page_14_category", a[14]);
    result.put("page_15_category", a[15]);
    result.put("page_16_category", a[16]);
    result.put("page_17_category", a[17]);
    result.put("page_18_category", a[18]);
    result.put("page_19_category", a[19]);
    result.put("page_20_category", a[20]);
    result.put("current_page_category", a[url_length]);
    if (url_length <= 1)
        var previous_page_cat = "";
    else
        var previous_page_cat = a[url_length_prev];
    result.put("previous_page_category", previous_page_cat);
    result.put("landing_page_type", a[1]);

   
    return result;
}
transformation();