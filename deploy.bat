@echo off
echo ==========================================
echo Deploying Shopping Website Application
echo ==========================================
if not exist deploy mkdir deploy
copy /Y target\shopping-website-1.0-SNAPSHOT.jar deploy\shopping-website.jar
echo Deployment completed successfully.
