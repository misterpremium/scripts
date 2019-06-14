numlegs = 20;
numHeads = 56;

def solve(numLegs, numHeads):
for numChicks in range (0, numHeads - numPigs + 1):
numPigs = numHeads - numChicks
totLegs = 2numChicks + 4 numPigs
if totLegs == numLegs:
 print 'Number of pigs:' + str(numPigs) +',',
print 'Number of chickens:' + str(numChicks) +',',
solutionFound = True
if not solutionFound: print 'Ther is not solution'
