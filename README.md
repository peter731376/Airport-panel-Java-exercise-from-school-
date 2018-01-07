# Airport-panel-Java-exercise-from-school-
My exercise from one Java course at Aalto School of Science
In the airport exercises we create an application to manage an airport, with its airplanes and flights. As far as the planes are concerned, we always know their ID and capacity. As for the flights, we know the plane used for the flight, the departure airport code (for instance HEL) and the destination airport code (for instance BAL).

There can be various different flights and planes. The same plane can also go on various different flights (various different routes). The application must offer two different panels. First, the airport worker inputs the flight and plane information to the system in the airport panel.

When the user exits the airport panel, the user then proceeds to use the flight service. The flight service has three actions: printing planes, printing flights, and printing airplane information. In addition to this, the user can exit the application by choosing x. If the user inputs an invalid command, the command is asked again.

Airport panel
--------------------

Choose operation:
[1] Add airplane
[2] Add flight
[x] Exit
> 1
Give plane ID: HA-LOL
Give plane capacity: 42
Choose operation:
[1] Add airplane
[2] Add flight
[x] Exit
> 1
Give plane ID: G-OWAC
Give plane capacity: 101
Choose operation:
[1] Add airplane
[2] Add flight
[x] Exit
> 2
Give plane ID: HA-LOL
Give departure airport code: HEL
Give destination airport code: BAL
Choose operation:
[1] Add airplane
[2] Add flight
[x] Exit
> 2
Give plane ID: G-OWAC
Give departure airport code: JFK
Give destination airport code: BAL
Choose operation:
[1] Add airplane
[2] Add flight
[x] Exit
> 2
Give plane ID: HA-LOL
Give departure airport code: BAL
Give destination airport code: HEL
Choose operation:
[1] Add airplane
[2] Add flight
[x] Exit
> x

Flight service
------------

Choose operation:
[1] Print planes
[2] Print flights
[3] Print plane info
[x] Quit
> 1
G-OWAC (101 ppl)
HA-LOL (42 ppl)
Choose action:
[1] Print planes
[2] Print flights
[3] Print plane info
[x] Quit
> 2
HA-LOL (42 ppl) (HEL-BAL)
HA-LOL (42 ppl) (BAL-HEL)
G-OWAC (101 ppl) (JFK-BAL)

Choose operation:
[1] Print planes
[2] Print flights
[3] Print plane info
[x] Quit
> 3
Give plane ID: G-OWAC
G-OWAC (101 ppl)

Choose operation:
[1] Print planes
[2] Print flights
[3] Print plane info
[x] Quit
> x
