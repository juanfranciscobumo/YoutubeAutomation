#encoding: iso-8859-1
#Author: juanfranciscobumo@gmail.co
Feature: Look a video in YouTube
  How an user of YouTube  
  I want to look for a video
  To check that the search is successful

  Scenario: Look a video
    Given that 'Juan' is on YouTube
    When Juan looks for the song 'need you now'
    And Juan plays video of 'Lady Antebellum - Need You Now'
    Then Juan checks that the video has duration of '4:31'
