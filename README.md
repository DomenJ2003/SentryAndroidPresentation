# Sentry

Sentry je orodje za spremljanje napak in zmogljivosti, ki omogoča razvijalcem hitro prepoznavanje in reševanje težav v njihovih aplikacijah. Pomaga izboljšati stabilnost programske opreme in uporabniško izkušnjo.

## Zakaj Sentry?
- **Hitro odkrivanje napak:** Sentry zagotavlja podrobna poročila o napakah v realnem času, vključno z informacijami o klicnih skladih, okoliščinah in uporabniških podatkih.
- **Podpora za več platform:** Podpira različne programske jezike in platforme, kot so Python, JavaScript, Java, .NET, Ruby, PHP, Go in mnogi drugi.
- **Enostavna integracija:** Preprosto se integrira v obstoječe projekte s pomočjo SDK-jev.
- **Prilagodljivost:** Omogoča prilagoditev poročil in opozoril glede na potrebe ekipe.

## Prednosti
- **Zmanjšanje časa za odpravljanje napak:** Hitrejša identifikacija in razumevanje napak.
- **Poglobljena analitika:** Natančni podatki o vzrokih napak in vplivu na uporabnike.
- **Prilagodljive funkcije:** Nastavljiva opozorila, nadzor nad izjemami in analitika zmogljivosti.
- **Integracije:** Podpora za priljubljena orodja, kot so Slack, GitHub, Jira itd.

## Slabosti
- **Stroški:** Napredne funkcionalnosti in večja uporaba lahko hitro povečajo stroške.
- **Ukrivulja učenja:** Za manj izkušene ekipe je lahko inicialna nastavitev zahtevna.
- **Obremenitev sistema:** Obsežna zbirka podatkov lahko poveča obremenitev strežnikov.

## Licenca
Sentry je na voljo pod licenco **Business Source License 1.1 (BSL 1.1)**. To pomeni, da je koda odprta za pregled in uporabo z določenimi omejitvami pri komercialni uporabi. Po treh letih od izdaje posamezne različice preide v **Apache 2.0** licenco.

## Število uporabnikov
Sentry je priljubljeno orodje z milijoni aktivnih uporabnikov po vsem svetu. Uporabljajo ga tako majhne ekipe kot velike korporacije, vključno z organizacijami, kot so Microsoft, GitHub in Atlassian.

## Vzdrževanje projekta
- **Število razvijalcev:** Projekt aktivno vzdržuje velika skupnost razvijalcev in podjetje Sentry, Inc.
- **Zadnji popravek:** Projekt je bil nazandnje posodobljen in objavljen 15 jauarja 2025. ([https://github.com/getsentry/sentry](https://github.com/getsentry/sentry)).

## Android aplikacija
Za prikaz delovanja sem oripravil enostavno android aplikacijo, ki vsebuje tri tipke za prozenje napak iz aplikacije.
<img width="330" alt="Screenshot 2025-01-18 at 10 04 40" src="https://github.com/user-attachments/assets/dedf0017-7bfd-4ec1-9b4e-14cf13e8a1c0" />

Ko sprozimo napkako v aplikaciji se ta prikaze v sentriju skupaj z nekaj dodatnimi podatki.
<img width="1201" alt="image" src="https://github.com/user-attachments/assets/1a691f25-b252-4044-915d-9625ecf9b5b1" />

Na sentry lahko posiljamo tudi obvestila.
<img width="1199" alt="image" src="https://github.com/user-attachments/assets/af8eb9ea-f878-425e-ae0d-4cc58e3e5a6b" />

Vec informacji o napaki lahko izvevmo ob podrobne pogledu posamične napake.
<img width="885" alt="image" src="https://github.com/user-attachments/assets/d2193065-6337-420c-8d22-ccb08e619113" />


Dobimo tudi stack trace

<img width="930" alt="image" src="https://github.com/user-attachments/assets/29a1241c-8286-4c61-9cf9-71a8dd58cd3e" />

In podatke o napravi

<img width="930" alt="image" src="https://github.com/user-attachments/assets/88d2504e-8657-46a4-b883-122de2eed412" />



