const result = document.querySelector('p')
const buttons = document.querySelectorAll('button')

let currentNum = "";
let firstOperand = null; //null= quando ele existe  mas nao tem nada definido
let operator = null;
let restart = false;

function updateResult(originClear = false){
    result.innerText = originClear ? 0 : currentNum.replace(".", ",");
}

function addDigit(digit){
    if(digit == "," && (currentNum.includes(",") || !currentNum)){
        return
    }
    currentNum += digit;
    updateResult();
}

function setOperator(newOperator){  //faz conta com o resultado da primeira conta feita
    if(currentNum){
        calculate();
        firstOperand = parseFloat(currentNum.replace(",", "."))
        currentNum = "";
    }
    operator = newOperator;
}

function calculate(){
    if(operator == null || firstOperand == null) return;
    let secOperand = parseFloat(currentNum.replace(",", "."))
    let resultValue;

    switch(operator){
        case '+':
            resultValue = firstOperand + secOperand
            break;
        case '-':
            resultValue = firstOperand - secOperand
            break;
        case 'x':
            resultValue = firstOperand * secOperand
            break;
        case '÷':
            resultValue = firstOperand / secOperand
            break;
        default:
            return;
    }

    if(resultValue.toString().split(".")[1]?.length > 5){
        currentNum = parseFloat(resultValue.toFixed(5)).toString()
    } else {
        currentNum = resultValue.toString();
    }

    operator = null;
    firstOperand = null;
    restart = true;
    updateResult();
}

function reset() {
    currentNum = "";
    firstOperand = null;
    operator = null;
    updateResult(true);
}

function delNums() {
    if(currentNum.length > 1){
        currentNum = currentNum.slice(0, -1)
    } else {
        currentNum = "0";
    }
    result.textContent = currentNum;
}

buttons.forEach((button) => {
    button.addEventListener('click', () => {
        const buttonText = button.innerText;
        if(/^[0-9,]+$/.test(buttonText)){
            addDigit(buttonText);
        } else if(["+", "-", "x", "÷"].includes(buttonText)) {
            setOperator(buttonText);
        } else if(buttonText == "=") {
            calculate();
        } else if(buttonText == "RESET"){
            reset();
        } else if(buttonText == "DEL") {
            delNums()
        }
    })
})