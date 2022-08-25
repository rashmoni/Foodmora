# Foodmora Recipe Manager
Java Project 1

## Table of contents
* [Introduction](#introduction)
* [Technologies](#technologies)
* [Run](#run)

## Introduction
This project is terminal based app.
It can be used by user and dietician.
User can view recipes to prepare meal, automatically generate recipes for the week.
Dietician can create new recipes and add to the pool of recipes.

## Technologies
Project is created with:
* Java 17.0.2 Version

## Run
To run this application do the following steps.
1. Make sure that project.properties file is present beside the jar file
2. Make sure that the database directory is present beside the jar file or correct path should be mentioned in the project.properties file
3. There should be 3 files in database directory
   - ingredients.txt
   - steps.txt
   - userweek.txt

Folder structure -
/foodmora
  - database
  - foodmora.jar
  - project.properties

/database
  - ingredients.txt
  - steps.txt
  - userweek.txt

```
$ cd ../foodmora
$ java -jar foodmora.jar
```