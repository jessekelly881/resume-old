build: resume.tex cover.tex
	pdflatex resume.tex & pdflatex cover.tex & pdfjoin cover.pdf resume.pdf -o complete.pdf


dev: resume.tex cover.tex
	ls *tex | entr make
