Calendar c = Calendar.getInstance();

// set time to 7th of Jan (zero based for month) at 15:40
c.set(2004, 0, 7, 15,40);

//convert to the amount of milliseconds
long da1 = c.getTimeInMillis();

// add an hour's worth of milliseconds then update the time
day1 += 1000 * 60 * 60;
System.out.println("new hour " + c.get(c.HOUR_OF_DAY));

// add 35 days onto this date
c.add(c.DATE, 35);


// rolls the date ahead 35 days, DOES NOT change the month
c.roll(c.DATE, 35);

// set the date to the X day of the month
c.set(c.Date, 1);
