# Utilisez une image Java 8
FROM openjdk:8-jdk-alpine

# Copiez les fichiers nécessaires dans le conteneur
COPY Etudiant.java /app/
COPY GestionEtudiants.java /app/
COPY Main.java /app/

# Définissez le répertoire de travail
WORKDIR /app

# Compilez les fichiers Java
RUN javac Etudiant.java GestionEtudiants.java Main.java

# Définissez la commande par défaut
CMD ["java", "Main"]
