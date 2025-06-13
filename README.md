# 📁 Dream Case App – RESTful API 

Ce projet est une API REST développée en **Java avec Spring Boot**.

---

##  Objectifs atteints

- Implémentation complète des opérations **CRUD** pour gérer des "cases" (`Create`, `Read`, `Update`, `Delete`)
- Utilisation de **Spring Boot 2.7.18** et **Java 11** (conformément aux spécifications du test)
- Persistance en base H2 **in-memory** (embarquée), avec console disponible
- Respect des conventions REST (`GET`, `POST`, `PUT`, `DELETE`)
- Fourniture de **2 tests unitaires** avec `MockMvc` pour valider l’API

---

##  Technologies utilisées

| Composant       | Version     |
|----------------|-------------|
| Java           | 11          |
| Spring Boot    | 2.7.18      |
| Spring Web     |             |
| Spring Data JPA|             |
| H2 Database    | (in-memory) |
| JUnit 5        |             |
| MockMvc        |             |
| Maven          |             |

---

##  Endpoints REST

| Méthode | URI                   | Description                     |
|--------:|------------------------|----------------------------------|
| `POST`  | `/cases`              | Créer un nouveau case           |
| `GET`   | `/cases/{id}`         | Obtenir un case par son ID      |
| `PUT`   | `/cases/{id}`         | Mettre à jour un case existant  |
| `DELETE`| `/cases/{id}`         | Supprimer un case par ID        |

---

##  Exemple de données

```json
{
  "title": "Projet stratégique",
  "description": "Analyse du dossier prioritaire"
}
