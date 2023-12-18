1) Android Mudules setup

Step 1: Create a Android Studio Project
	- Go to Android Android 
	- click on New Android Project

Step 2: Create a Android Library
	- Click on File 
	- Click on new Module
	- Select Android Module
	- Write your Module name

Step 3: Add yml file in your project level
	- File name like "jitpack.yml"
	- Add this in file:
	jdk:
  		- openjdk17
	before_install:
  		- ./scripts/prepareJitpackEnvironment.sh

Step 4: Create a Common fun in your module
	- For example you can create a Validation file
	- and check email is valid or not

 Step 5: 
 	- Add your module in your project using implementation
 	- add module
    implementation(project(":mubaraklibrary"))


2) Github Repository and JitPack Setup

Step 1: Create a Guthub Repo and push your code in github

Step 2: Add publishing in your module gradle file
	//add
publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "com.github.mubarakansari715"
            artifactId = "mubaraklibrary"
            version = "1.0.0"

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}


Step 3: Create your release version from your github
 
Step 4: Goto Jitpack official website
 	https://jitpack.io/

Step 5: Add your repo in jitpack and check

Step 6: Result of jitpack
	- you can user your lib in your all project.
