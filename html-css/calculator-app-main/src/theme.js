document.addEventListener('DOMContentLoaded', () => {
    const theme = ['theme1', 'theme2', 'theme3']
    const button = document.querySelector('.circle')
    const toggle = document.querySelector('.toggle')
    const themeNums = document.querySelectorAll('num-list li')
    const body = document.body;
    let themeIndex = 0;

    const updateTheme = () => {
        body.className = "";
        body.classList.add(theme[themeIndex])
        toggle.classList.add(theme[themeIndex])
    }

    button.addEventListener('click', () => {
        themeIndex = (themeIndex + 1) % theme.length;
        updateTheme();
    })

    themeNums.forEach((number, i) => {
        number.addEventListener('click', () => {
            themeIndex = i;
            updateTheme();
        })
    })
    updateTheme();
})