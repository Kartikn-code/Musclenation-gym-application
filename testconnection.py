from pymongo import MongoClient
Con_URL= "mongodb://localhost:27017/"

user= MongoClient(Con_URL)
for db_name in user.list_database_names():
    print(db_name)





