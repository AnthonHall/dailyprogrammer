def namelist(names):
	howmany = len(names)
	formattedNames = ""
	for namedict in range(howmany):
		if namedict >= howmany - 1:
			formattedNames += names[namedict]["name"]
		elif namedict >= howmany - 2:
			formattedNames += names[namedict]["name"] + " & "
		else:
			formattedNames += names[namedict]["name"] +  ", "
	return formattedNames