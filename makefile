build: resume.tex
	pdflatex resume.tex & pdflatex cover.tex


dev: resume.tex
	ls *tex | entr pdflatex resume.tex
