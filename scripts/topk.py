import pandas as pd
import sys
import os

loc = pd.read_csv("./loc.csv")

def filter(in_file, projectname, bugid):
    data = pd.read_csv(in_file)
    loc = pd.read_csv("./loc.csv")
    mean_val=data.iloc[0]["mean_score_of_loaded_classes"]
    median_val=data.iloc[0]["median_score_of_loaded_classes"]
    print(projectname + "," + str(bugid) + "," + str(mean_val) + "," + str(median_val))

def top_n(klist):
    """
    input: k vals
    output: top n for n = 1, 2, 3, .. 50
    """
    pass

def get_loc(project, bug):
    return df[df['Project'] == project][df['RealBugId'] == bug].iloc[0][2]

def get_k_vals(in_file):
    """
    output: k vals for all projects in a list
    """
    df = pd.read_csv(in_file)
    klist = [ df.iloc[i][3]*get_loc( df.iloc[i][0],  df.iloc[i][1]) for i in range(len(df))]
    return klist

if __name__ == "__main__":
    """
    input : median wasted effort csv <project>,bugid,mean,median -- for all projects
    input : loc csv

    """
    in_file = sys.argv[1]
    klist = get_k_vals(in_file)
