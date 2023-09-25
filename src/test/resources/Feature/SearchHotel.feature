Feature: User verifying the SearchHotel module

  Scenario Outline: User verifying  Adactim SelectHotel
    Given user should perform login with "<username>" and "<password>"
    When user click login
    Then user should search the hotel following the depends "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check in date>","<Check out date>","<Adults per Room>","<Childrens per Room>"

    Examples: 
      | username      | password   | Location | Hotels        | RoomType    | NumberofRooms | Checkindate | Checkoutdate | AdultsperRoom | ChildrensperRoom |
      | venkatesh1228 | venkat1228 | London   | HotelSunshine | SuperDeluxe | 1 - One       | 20-09-2023  | 21-09-2023   | 1 - One       | 1 - One          |
