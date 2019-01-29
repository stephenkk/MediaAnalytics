# MediaAnalytics
The program WebPagesStats.java reads a data file that contains unique visits to a web site and counts up the number of visits
per sub-page. The data file contains the indentifying number of each sub-page of the site. Each appearance of the indentifying
number represents a unique visit to that sub-page. There are 100 entries per file, one per line:

2

4

7

7

54

62

54

3

54

etc.

The appearance of the number 2 one time means sub-page 2 was visited once. The appearance of the number 54 three times means
sub-page 54 was visited three times, and so one.

The program extracts the name of the company and the date from the filename. It then
prints the number of times each sub-page was visited and identifies the sub-
page that received the most visits.

The name of the file that the program reads is CBS 20181223 PageView.txt. The file is read from a URL that is embedded in the code.
