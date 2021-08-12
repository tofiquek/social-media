# social-media

In Social Media Application:

User:
  Created User(It is our EndUser or client) It create Posts, Put Comments on Post & Link the Post.
  It has Profile which it can Edit.
  User can have Multiple Post,Comments & Like
  
Post:
  Post is done by user to Share it views on social media.
  Without User Post,Comments & Like is not Possible
  User can Like a Post
  User can Add Comment on the Post
  A User can only like a Post Single Time.
  A user can put comment Multiple Times.  
  
Link's :
  User : http://localhost:8100/social-media/users
  Post : http://localhost:8100/social-media/{userId}/posts

Packages :
  dto         : For Data Transfer Object
  controller  : For rest controller
  repository  : For JPA Repository
  Service     : For Business Logic

Relations :
  Post has Many to one relationship with User
  Comments has Many to one relationship with Post & User

Technologies :
  SpringBoot
  JPA
  
Entity Diagram
![Social Media App Entity Diagram](https://github.com/tofiquek/social-media/blob/master/docs/SocialMedia.jpg)
