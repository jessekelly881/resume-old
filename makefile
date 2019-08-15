build: resume.tex
	pdflatex resume.tex


dev: resume.tex
	echo "resume.tex" | entr pdflatex resume.tex
