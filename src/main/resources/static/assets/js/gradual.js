/**
 * Created by skywalker on 2017/3/2.
 */
    $(function(){
        $(window).scroll(function() {
            // 浏览器窗口的高度
            var windowPageYOffset = window.pageYOffset;
            // 浏览器窗口的高度 + 页面滚动的距离
            var windowPageYOffsetAddHeight = windowPageYOffset + window.innerHeight;
            // 该值越小，越早触发效果，自己随便设置
            var sensitivity = 1000;

           /* var imgOffsetTop = $(".transImg").offset().top;
            if (imgOffsetTop >= windowPageYOffset && imgOffsetTop < windowPageYOffsetAddHeight + sensitivity) {
                // 达到一定位置，触发效果，透明度变为1
                $(".transImg").css({
                    "transform": "translate3d(0, 0, 0)",
                    "-ms-transform": "translate3d(0, 0, 0)",
                    "-o-transform": "translate3d(0, 0, 0)",
                    "-webkit-transform": "translate3d(0, 0, 0)",
                    "-moz-transform": "translate3d(0, 0, 0)",
                    "opacity": 1
                });
            }*/


            /*模块一*/
            var mudRow = $("#services .row").offset().top;
            if (mudRow >= windowPageYOffset && mudRow < windowPageYOffsetAddHeight + sensitivity) {
                // 达到一定位置，触发效果，透明度变为1
                $(".mov_left").css({
                    "left": "0",
                    "opacity": 1
                });
                $(".mov_rote").css({
                    "transform": "scale(1)",
                    "opacity": 1
                });
                $(".mov_right").css({
                    "right": "0",
                    "opacity": 1
                });
            }

            /*模块二*/
            var mudOne = $("#last_posts .contbox").offset().top;
            if (mudOne >= windowPageYOffset && mudOne < windowPageYOffsetAddHeight + sensitivity) {
                // 达到一定位置，触发效果，透明度变为1
                $("#last_posts .contbox").css({
                    "top": "0",
                    "opacity": 1
                });
            }

            /*模块四*/
            var team = $("#team .row").offset().top;
            if (team >= windowPageYOffset && team < windowPageYOffsetAddHeight + sensitivity) {
                // 达到一定位置，触发效果，透明度变为1
                $("#team .col-md-3").css({opacity: 1,top:0});
            }
        })

        $(".classbox").click(function(){
            window.location.href='pagehtml.html';
        });


    });