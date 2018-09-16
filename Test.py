import spacy

from collections import Counter

# FAZER CRUD DEPOIS

caminho = '/home/savio/curriculo.txt'  # pdf teste

nlp = spacy.load('pt')  # modelo

txt = caminho  # só para teste
#txt = input('local do txt~> ')  # carregar caminho do txt

arquivo = str(open(txt).read())  # transformar txt em string

doc = nlp(arquivo.lower())  # texto processado e minusculo para facilitar na comparação

listaTokens = []   # salvar no banco de dados
listaCont = []

#palavras chaves
palavra_chave00 = nlp('sistemas')
palavra_chave01 = nlp('graduado')
palavra_chave02 = nlp('computação')
palavra_chave03 = nlp('graduando')

# 3 primeiras strings = nome da pessoa
nome = doc[:3]
email = nlp('@gmail.com')
email1 = nlp('@hotmail.com')

pontuacao = 0

for token in doc:
    print(token.orth_, ' ~> ', token.pos_)  # imprimir texto tokenizado
    if(((token.similarity(palavra_chave00))>0.6) or ((token.similarity(palavra_chave01))>0.6) or ((token.similarity(palavra_chave02)) > 0.6) or ((token.similarity(palavra_chave03))>0.6)):
        listaTokens.append(token)
        listaCont.append(token.orth_)


pontuacao = len(listaTokens)
contador = Counter(listaCont)

print('\n\n', listaTokens, ', ', pontuacao)
print(contador)
print(nome,', ', len(nome))



# ID, PONTUACAO, PALAVRAS_CHAVE, EMAIL