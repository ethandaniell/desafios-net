const result = document.querySelector('p')
const botoes = document.querySelectorAll('button')

let numeroAtual = "";
let primOperando = null; //null= quando ele existe  mas nao tem nada definido
let operador = null;
let restart = false;

function updateResult(originClear = false){
    result.innerText = originClear ? 0 : numeroAtual.replace(".", ",");
}

function addDigito(digit){
    if(digit == "," && (numeroAtual.includes(",") || !numeroAtual)){
        return
    }
    numeroAtual += digit;
    updateResult();
}

function setOperacao(newOperator){  //faz conta com o resultado da primeira conta feita
    if(numeroAtual){
        calcular();
        primOperando = parseFloat(numeroAtual.replace(",", "."))
        numeroAtual = "";
    }
    operador = newOperator;
}

function calcular(){
    if(operador == null || primOperando == null) return;
    let segOperando = parseFloat(numeroAtual.replace(",", "."))
    let resultValue;

    switch(operador){
        case '+':
            resultValue = primOperando + segOperando
            break;
        case '-':
            resultValue = primOperando - segOperando
            break;
        case 'x':
            resultValue = primOperando * segOperando
            break;
        case '÷':
            resultValue = primOperando / segOperando
            break;
        default:
            return;
    }

    if(resultValue.toString().split(".")[1]?.length > 5){
        numeroAtual = parseFloat(resultValue.toFixed(5)).toString()
    } else {
        numeroAtual = resultValue.toString();
    }

    operador = null;
    primOperando = null;
    restart = true;
    updateResult();
}

function reset() {
    numeroAtual = "";
    primOperando = null;
    operador = null;
    updateResult(true);
}

function delNumeros() {
    if(numeroAtual.length > 1){
        numeroAtual = numeroAtual.slice(0, -1)
    } else {
        numeroAtual = "0";
    }
    result.textContent = numeroAtual;
}

botoes.forEach((botao) => {
    botao.addEventListener('click', () => {
        const botaoTexto = botao.innerText;
        if(/^[0-9,]+$/.test(botaoTexto)){
            addDigito(botaoTexto);
        } else if(["+", "-", "x", "÷"].includes(botaoTexto)) {
            setOperacao(botaoTexto);
        } else if(botaoTexto == "=") {
            calcular();
        } else if(botaoTexto == "RESET"){
            reset();
        } else if(botaoTexto == "DEL") {
            delNumeros()
        }
    })
})