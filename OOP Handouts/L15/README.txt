starter.html -- Template for creating XHTML files

login-unformatted.html -- Basic form example using GET.
  This example uses <p> paragraph tags only for formatting and
  as a result does not display very nicely.  This type of formatting
  is sufficient for HW5.
  
login.html -- The same example as login-unformatted.html, except
  an HTML table is used to arrange the form elements, leading to
  a more professional-looking page.

-----

This example shows connecting a form on a webpage to a servlet.

The servlet uses getParameter to request information entered in the form
and generates output using the response's PrintWriter

basic-voting.html -- webpage with form
Voting.java -- servlet that runs when form is submitted

-----

This example shows use of forwarding.

The servlet uses getParameter to request information entered in the form.
This information is used to forward to one of two pages.

voting.html -- webpage with form
VotingForward.java -- servlet that runs when form is submitted

canvote.html, noteligible.html -- different webpages that are displayed 
  depending on servlet actions
  
-----

We can store information in the HttpSession object.  In this example,
when the user enters their name on the webpage, we store it in the
session object using the NameEntry.java servlet.  Later we can retrieve
is using the RetrieveName.java servlet.  However, if we try to access
the name before it is saved we get a null.

enter-name.html -- Webpage with form.  Try clicking on the "Don't click
  here before submitting name."  Notice that it gives the name as null
NameEntry.java -- Sets name on the HttpSession object.
RetrieveName.java -- Generates a new webpage using the user's name.

----

We can initialize the HttpSession object using a Listener.  In this example
the CityListener class runs when the session is created and sets an 
initial value for the session's city attribute.

The rest of this example is very similar to the Name example above, except
that we can retrieve the city before the user explicitly sets it, because
the CityListener has set a default value.

enter-city.html -- Webpage with form.  Clicking on the "Okay to click here ..."
  works fine, since an initial value for the city was set when the session was 
  created.
CityEntry.java -- Sets the city on the HttpSession object.
RetrieveCity.java -- Retrieves the city on the HttpSession object.
CityListener.java -- Run when the session is created.  Sets the initial city
  value.

