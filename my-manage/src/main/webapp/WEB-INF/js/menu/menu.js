/**
 * Created by chenlei on 2017/11/18.
 */
$(function(){
    var menu = [
        {
            section:'Section',
            menu:[
                {
                    name:'Home',
                    action:'/main',
                    icon:'fa-home',
                    subMenu:[
                        {
                            name:'主界面',
                            action:'/main',
                        }
                    ]
                }
            ]
        }
    ];

    var d = {};
    d.data = menu;
    var mainMenuTemp=template("mainMenuTemp",d);
    $("#sidebar-menu").html(mainMenuTemp);
});