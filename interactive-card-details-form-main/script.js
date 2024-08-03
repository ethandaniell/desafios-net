const form = document.querySelector("form");
const buttonConfirm = document.querySelector(".confirm");
const thanks = document.querySelector(".thanks");
const buttonContinue = document.querySelector(".continue");
const nameInput = document.querySelector("#form-name");
const numberInput = document.querySelector("#form-card-number");
const monthInput = document.querySelector(".mm")
const yearInput = document.querySelector(".yy");
const cvcInput = document.querySelector("#form-cvc")

let name = document.querySelector(".card-name");
let number = document.querySelector(".card-number");
let month = document.querySelector(".card-month");
let year = document.querySelector(".card-year");
let cvc = document.querySelector(".card-back-number");

function confirm() {
    form.style.display = 'none';
    buttonConfirm.style.display = 'none';
    thanks.style.display = 'block';
}

function continuar() {
    thanks.style.display = 'none';
    form.style.display = 'block';
    buttonConfirm.style.display = 'block';
}

buttonConfirm.addEventListener('click', confirm);
buttonContinue.addEventListener('click', continuar);