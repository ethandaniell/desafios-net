const ratingPage = document.querySelector(".rating-page");
const thanksPage = document.querySelector(".thanks-page");
const buttons = document.querySelectorAll(".bttn-rating");
const submitBttn = document.querySelector(".bttn-submit");
const selectedText = document.querySelector(".selected");
const defaultActive = document.querySelector(".default-active");

function submit() {
    const wasSelected = document.querySelector('.was-selected');
    if(wasSelected != null) {
        ratingPage.style.display = 'none';
        thanksPage.style.display = 'block';
        selectedText.textContent = `You selected ${wasSelected.textContent} out of 5`;
    } else {
        window.alert("Please select a value.");
    }
}

submitBttn.addEventListener('click', submit);

buttons.forEach((button) => {
    button.addEventListener('click', function() {
        buttons.forEach((isSelected) => {
            isSelected.classList.remove("was-selected");
        });
        button.classList.add("was-selected");
        if (defaultActive) {
            defaultActive.classList.remove("default-active");
        }
    });
});
