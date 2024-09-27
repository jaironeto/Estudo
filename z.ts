

type MeuTipo = {
  nome: string,
  profissao: string
}

type MeuTipo2 = MeuTipo & {
  idade: number
}

const obj: MeuTipo2 = {
  idade: 24,
  nome: "jairo",
  profissao: "programador"
}
