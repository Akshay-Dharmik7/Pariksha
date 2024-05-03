# Pariksha
Pariksha: Your go-to GitHub repository for an intuitive and efficient online MCQ testing platform.
Welcome to Pariksha - your comprehensive online MCQ testing platform!

## Introduction
Pariksha is an intuitive and efficient online multiple-choice question (MCQ) testing platform designed to streamline the assessment process for students, educators, and professionals. With a user-friendly interface and robust backend system, Pariksha offers a seamless testing experience for both administrators and test-takers.

## Features
- **User-Friendly Interface**: Navigate through the platform effortlessly with a clean and intuitive design.
- **Secure Authentication**: Ensure data security with a secure authentication system for administrators and users.
- **Question Bank Management**: Easily manage and organize a diverse question bank covering various subjects and topics.
- **Customizable Exams**: Create custom exams tailored to specific subjects, difficulty levels, and time limits.
- **Real-Time Monitoring**: Monitor exams in real-time, view progress, and generate detailed reports for analysis.
- **Scalable Architecture**: Built with scalability in mind to accommodate growing user bases and increasing demands.

## Getting Started
Follow these steps to get started with Pariksha:
1. **Clone the Repository**: Clone this repository to your local machine using `git clone`.
2. **Install Dependencies**: Navigate to the project directory and install dependencies using `npm install`.
3. **Set Up Environment**: Set up your environment variables and configurations as per the provided guidelines.
4. **Run the Application**: Start the application locally using `npm start` and access it via your web browser.

## Contributing
Contributions are welcome! If you'd like to contribute to Pariksha.

# Demonstration Images of the Software

## Admin Profile

### Registration Page
- Users: All who are not registered with Exam Dojo
- Users are required to enter a valid:
  - Username
  - Password
  - First Name
  - Last Name
  - Email
  - Phone Number
- All entries are validated and appropriate errors will be given
- Accounts are authenticated using JWT Authentication![](https://github.com/Akshay-Dharmik7/Pariksha/blob/master/SS/registration.png)

### Login Page
- Users: All who are registered with Exam Dojo
- Users are required to enter a valid:
  - Username
  - Password
  - First Name
  - Last Name
  - Email
  - Phone Number
- All entries are validated and appropriate errors will be given
- Accounts are authenticated using JWT Authentication

  ![](https://github.com/Akshay-Dharmik7/Pariksha/blob/master/SS/admin_login.png)

### Welcome Page of Admin-Side
- Users: Professors or anyone who has logged in with an Admin Profile
  
  ![](https://github.com/Akshay-Dharmik7/Pariksha/blob/master/SS/admin_home.png)


### Viewing Your Profile Details
- Users: Professors or anyone who has logged in with an Admin Profile
- How to Get Here: Click on the ‘*Profile*’ button from the menu on the left

  ![](https://github.com/Akshay-Dharmik7/Pariksha/blob/master/SS/admin_profile.png)


### Adding a Subject
- Users: Professors or anyone who has logged in with an Admin Profile
- How to Get Here: 
  - Click on the ‘*Add Subject*’ button from the menu on the left
  - Click on ‘*Add New Subject*’ below the created subjects within the ‘*Subjects*’ sub-menu
- What you have to enter:
  - Name of the subject
  - Description of the subject
 
  ![](https://github.com/Akshay-Dharmik7/Pariksha/blob/master/SS/add_category.png)

### Viewing Created Subjects
- Users: Professors or anyone who has logged in with an Admin Profile
- How to Get Here: Click on the ‘*Subjects*’ button from the menu on the left

  ![](https://github.com/Akshay-Dharmik7/Pariksha/blob/master/SS/available_category.png)

### Adding a Quiz
- Users: Professors or anyone who has logged in with an Admin Profile
- How to Get Here: Click on the ‘*Add Quiz*’ button from the menu on the left
- What you have to enter:
  - Name of the Quiz
  - Description of the Quiz
  - Maximum Marks for the Quiz
  - Number of Questions to be asked
  - Subject that the quiz is part of
  - ‘Publish Status’ toggle will control whether the student is able to view the quiz on their profile

![](https://github.com/Akshay-Dharmik7/Pariksha/blob/master/SS/add_quiz.png)

### Adding Questions to a Quiz
- Users: Professors or anyone who has logged in with an Admin Profile
- How to Get Here: Click on the ‘Questions’ button from the row of buttons below the name of a created quiz within the Quizzes Page
- How to Create Your First Question:
  - After clicking on the ‘Questions’ button, click on ‘Add Question’ Button
  - Enter your question in the text field given
    - Questions can be formatted with different font styles, equations, colors, hyperlinks or images with the use of the ribbon of formatting options on the top border of the text filed
  - Enter the four options you would like the student to choose from
  - Select the correct answer from the dropdown list
    - The correct answer must be one of the options
  - Click on ‘*Add*’ button at the bottom of the page
  - You have successfully created a question
  - If you would like to start afresh, you can clear the question and associated option with the ‘*Clear*’ button at the bottom of the page before clicking on the ‘Add’ button
  - Repeat this process to add further questions
- Questions can be updated after adding by clicking on the ‘*Update*’ button within the ‘*Questions*’ *Page*

![](https://github.com/Akshay-Dharmik7/Pariksha/blob/master/SS/add_question.png)

### Updating Quiz Information
- Users: Professors or anyone who has logged in with an Admin Profile
- How to Get Here: Click on the ‘*Update*’ button from the row of buttons below the name of a created quiz within the Quizzes Page

![](https://github.com/Akshay-Dharmik7/Pariksha/blob/master/SS/total_quiz.png)


## Student Profile

### View All Quizzes
- Users: Students
- How to Get Here: Click on the ‘*All Quizzes*’ button from the menu on the left

![](https://github.com/Akshay-Dharmik7/Pariksha/blob/master/SS/client_home.png)


  ### Starting a Quiz
- Users: Students
- How to Get Here: Click on the “*Start*” button below the quiz name
- Instructions for attempting the quiz will be shown on starting the quiz
- To start answering questions, click on the “*Start Quiz*” button from the instructions page

![](https://github.com/Akshay-Dharmik7/Pariksha/blob/master/SS/quiz_page.png)

- A confirmation pop-up will be displayed to start the quiz.
- Click on the “*Start*” button to start. Else, click on the “*No*” button

![](https://github.com/Akshay-Dharmik7/Pariksha/blob/master/SS/quiz_start.png)  

### Viewing the Result for a Quiz
- Users: Students
- How to Get Here: From the “Available Quizzes” page, click on the “*See Results*” button below the name of the quiz you would like to see the results for

 ![](https://github.com/Akshay-Dharmik7/Pariksha/blob/master/SS/result_page.png)   
