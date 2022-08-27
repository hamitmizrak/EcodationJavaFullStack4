//()();
let nowDate = () => {
    let year = new Date().getFullYear();
}

// backTo Top
$(window).scroll(function () {
    if ($(this).scrollTop() > 90) {
        $('#back_top').fadeIn('slow');
    } else {
        $('#back_top').fadeOut('slow');
    }
});

$("#back_top").click(function () {
    $('html,body').animate({ scrollTop: 0 }, 90, 'easeInOutExpo');
    return false;
})

// Dark Light Button
let darkLight = () => {
    let data = document.body.classList.toggle("dark-mode");
}