
buf = 'u'*450
f = open("data", "w")
for i in range(0, 100000) :
	f.write(str(i)+str(buf)+'\n')
