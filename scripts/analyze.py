import pandas as pd
import sys
import os

def filter(in_file, projectname, bugid):
    data = pd.read_csv(in_file)
    loc = pd.read_csv("./loc.csv")
    mean_val=data.iloc[0]["mean_score_of_loaded_classes"]
    median_val=data.iloc[0]["median_score_of_loaded_classes"]
    print(projectname + "," + str(bugid) + "," + str(mean_val) + "," + str(median_val))
    

if __name__ == "__main__":
    in_file = sys.argv[1]
    projectname = sys.argv[2]
    bugid = sys.argv[3]
    filter(in_file, projectname, bugid)
