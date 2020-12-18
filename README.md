# Project made by Antoine MORTELIER & Logan CHENAVIER

# E-Commerce API

This API was made on Spring for a school project.
It is a simulation on a e-commerce, you can create an account, articles, make command and buy it.
There is a few logical sequence to follow in the requests :

- You can't access to the requests as long as you are not logged in (you can access to the catalog and the account creation anyway).
- You can't buy a command if a command doesn't exist yet. Create a command first, buy it then.

The Auth0 security doesn't work yet, I couldn't make the link between the access token and the API.

## Insomnia

All the test requests are in ./api/e-commerce.json, you can import it on Insomnia.

## Requests

### Catalogue

**GET**

getCatalogue

> Display the catalog with only the products with a quantity superior to zero.

### Stock

**GET**

findByQuantity

> Find the stock by quantity.

getStock

> Display all the stocks.

**POST**

postStock

> Post a new stock.

**PUT**

putStock

> Put a stock to edit existing one or create a new one.

**DELETE**

deleteStock

> Delete a stock.

### Article

**GET**

findByName

> Find the product by name.

getArticle

> Display all the products.

**POST**

postArticle

> Post a new product.

**PUT**

putArticle

> Put a product to edit existing one or create a new one.

**DELETE**

deleteArticle

> Delete a product.

### Commande

**GET**

getCommande

> Display all the commands.

**POST**

Créer une commande

> Create a new command and add it to the existing ones.

**DELETE**

deleteCommande

> Delete a command.

### Client

**GET**

findByLastname

> Find the client by his lastname.

getClient

> Display all the clients.

**POST**

postClient

> Post a new client.

Client buy a product

> Buy an existing command for a client. !WARNING! A command might already exist to make that request, or an exception would be thrown.

**PUT**

putClient

> Put a client to edit existing one or create a new one.

**DELETE**

deleteClient

> Delete a client.

### Reduction

**GET**

findByPercent

> Find the reduction by percent.

getReduction

> Display all the reductions.

**POST**

postReduction

> Post a new reduction.

**PUT**

putReduction

> Put a reduction to edit existing one or create a new one.

**DELETE**

deleteReduction

> Delete a reduction.
