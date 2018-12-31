# MediaAnalytics
The program WebPages reads a data file that contains unique visits to a web site and counts up the number of visits
per sub-page. The files are text files that have recorded the number
of times users have clicked through a corporate web site to reach a sub-page of
the web site. Each sub-page is identified with a number between 1 - 99 and there
are 100 entries per file, one per line. Each 
appearance of the identifying number represents a unique visit to the sub-page
So if 16 appears 7 times, it means that seven users visted sub-page 16. The 
program extracts the name of the company and the date from the filename. It then
prints the number of times each sub-page was visited and identifies the sub-
page that received the most visits.

The filename is embedded in the program and is assigned to a string variable. There are 3 data files to test that should be 
downloaded to the root directory C:\. The format of the file names is COMPANYNAME YYYYMMDD PageViews.txt. The filename in the program
CBS 20181223 PageView.txt. To run the Viacom or NBC change the company name in the filename at line 27.
