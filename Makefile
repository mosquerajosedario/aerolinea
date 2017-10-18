JC = javac

all = AeroCarena.class

AeroCarena.class: Plane.class AeroCarena.java
	$(JC) AeroCarena.java

Plane.class: Plane.java
	$(JC) Plane.java

clean: 
	$(RM) *.class
