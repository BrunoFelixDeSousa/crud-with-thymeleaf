// Função para carregar a lista de estados a partir da API do IBGE
async function carregarEstados() {
    const ufSelect = document.getElementById("ufSelect");

    try {
        const response = await fetch("https://servicodados.ibge.gov.br/api/v1/localidades/estados");
        const estados = await response.json();

        estados.forEach(estado => {
            const option = document.createElement("option");
            option.value = estado.sigla;
            option.text = estado.nome;
            ufSelect.appendChild(option);
        });
    } catch (error) {
        console.error("Erro ao carregar estados:", error);
    }
}

// Função para carregar cidades com base na UF selecionada
async function carregarCidades() {
    const ufSelect = document.getElementById("ufSelect");
    const cidadeSelect = document.getElementById("cidadeSelect");
    const ufSelecionada = ufSelect.value;

    // Limpa o combo de cidades
    cidadeSelect.innerHTML = '<option value="">Selecione uma cidade...</option>';

    // Verifica se uma UF foi selecionada
    if (ufSelecionada !== "") {
        try {
            const response = await fetch(`https://servicodados.ibge.gov.br/api/v1/localidades/estados/${ufSelecionada}/municipios`);
            const cidades = await response.json();

            cidades.forEach(cidade => {
                const option = document.createElement("option");
                option.value = cidade.nome;
                option.text = cidade.nome;
                cidadeSelect.appendChild(option);
            });
        } catch (error) {
            console.error("Erro ao carregar cidades:", error);
        }
    }
}

// Adiciona um ouvinte de evento para o combo de UF
const ufSelect = document.getElementById("ufSelect");
ufSelect.addEventListener("change", carregarCidades);

// Carrega a lista de estados ao carregar a página
carregarEstados();
