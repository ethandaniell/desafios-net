const name = document.querySelector("#name");
const lastName = document.querySelector("#last-name");
const email = document.querySelector("#email");
const password = document.querySelector("#password");

const nameError = document.querySelector("#name-error");
const lastNameError = document.querySelector("#last-name-error");
const emailError = document.querySelector("#email-error");
const passwordError = document.querySelector("#password-error");

const button = document.querySelector("button");

function  validateEmpty(valueInput, spanInput, spanError, nameInput) {
    if(valueInput.length == 0) {
        showError(spanInput, spanError, `${nameInput}`);
    } else {
        hideError(spanInput, spanError);
    }
}
    

function validateEmail(valueInput, spanInput, spanError) {
    const expReg = /[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?/g;
    if (expReg.test(valueInput)) {
        hideError(spanInput, spanError);
    } else {
        showError(spanInput, spanError, 'Looks like this is not an email');
    }
}

function showError(spanInput, spanError, error) {
    spanInput.style.border = '1px solid hsl(0, 100%, 74%)';
    spanError.innerHTML = `
    <img class="icon-error" src="images/icon-error.svg" alt="icon error">
            <p class="error">${error}.</p>
    `
}

function hideError(spanInput, spanError) {
    spanInput.style.border = '1px solid hsl(246, 25%, 77%)';
    spanError.innerHTML = ' '
}

button.addEventListener('click', (e) => {
    e.preventDefault();
    validateEmpty(name.value, name, nameError, 'First Name cannot be empty');
    validateEmpty(lastName.value, lastName, lastNameError, 'Last Name cannot be empty');
    validateEmail(email.value, email, emailError);
    validateEmpty(password.value, password, passwordError, 'Password cannot be empty');
})