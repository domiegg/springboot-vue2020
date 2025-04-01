$(function(){
    (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
        (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
        m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
    })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

    ga('create', 'UA-55836286-1', 'auto');
    ga('send', 'pageview');
    //不同子域共用模板，js替换域名
    var domain_pre = (window.location.host || "").split('.')[0]||"";

    $("body [mate_data_ts]").each(function() {
        $(this).bind('click', function() {
            var ge_get = $(this).attr('mate_data_ts');
            var ge_gets = ge_get.split('.');
            if(ge_gets.length){
                ga('send', 'event', (ge_gets[0]||'').replace("{{domain_pre}}",domain_pre), ge_gets[1]||'', ge_gets[2]||'', +ge_gets[3]||1);
                //示例：ga('send', 'event', 'button', 'click', 'top_login_link', 1);
            }
        });
    });
});