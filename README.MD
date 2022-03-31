  .,-:::::     ...      ...    ::::::.    :::.:::::::::::::::::::..   :::.,:::::: .::::::. 
,;;;'````'  .;;;;;;;.   ;;     ;;;`;;;;,  `;;;;;;;;;;;'''';;;;``;;;;  ;;;;;;;'''';;;`    ` 
[[[        ,[[     \[[,[['     [[[  [[[[[. '[[     [[      [[[,/[[['  [[[ [[cccc '[==/[[[[,
$$$        $$$,     $$$$$      $$$  $$$ "Y$c$$     $$      $$$$$$c    $$$ $$""""   '''    $
`88bo,__,o,"888,_ _,88P88    .d888  888    Y88     88,     888b "88bo,888 888oo,__88b    dP
  "YUMMMMMP" "YMMMMMP"  "YmmMMMM""  MMM     YM     MMM     MMMM   "W" MMM """"YUMMM"YMmMY"


ABOUT

    Countries is a java REST API which connects to restcountries.com and retrieves country info.


ENDPOINTS

    GET /countries

        Retrieves the list of all countries in the following format as response:
        "countries":[{"name":"Uruguay","country_code":"UY"}, ... etc


    GET /countries/{name}

        Retrieves a single country in the following format as response:
        {"name":"Uruguay","country_code":"UY","capital":"Montevideo","population":3473727,"flag_file_url":"https://flagcdn.com/w320/uy.png"}


HOW TO RUN

    1. Clone this GitHub project
    2. Navigate to project root and execute the command "mvn package"
    3. Execute the .jar file with "java -jar target\countries-0.0.1-SNAPSHOT.jar"
        a. Default port is set as 8080
        b. You may choose to define the port while excuting "--server.port=<port_number>"
    4. Now you can send GET requests using web browser or a http tool (postman, curl)
        a. Default address is http://localhost:8080

LICENSE

    This software is distributed under The MIT License

    Copyright (c) 2022 Sampo Lunkka

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
