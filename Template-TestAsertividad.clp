(deftemplate persona
        (multislot nombre 
                (type STRING)
                (default ?DERIVE)
        )
        (slot edad 
                (type NUMBER)
                (default ?DERIVE)
        )
        (slot genero
                (type SYMBOL)
                (default ni)
                (allowed-symbols ni M F)
        )
        (slot pregunta1
                  (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta2
                  (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta3
                  (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta4
                  (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta5
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta6
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta7
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta8
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta9
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta10
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta11
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta12
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta13
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta14
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta15
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta16
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta17
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta18
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta19
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta20
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta21
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta22
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta23
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta24
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta25
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta26
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta27
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta28
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta29
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot pregunta30
                (type NUMBER)
                 (default ?DERIVE)
        )
        (slot puntuacion
                (type NUMBER)
                (default ?DERIVE)
        )
        (slot nivel_asertividad
                 (type STRING)
                (default ?DERIVE)
        )
)

(assert (persona (nombre "Maria Pelaez")(edad 23)(genero F)(pregunta1 1)(pregunta2 2)(pregunta3 -2)(pregunta4 -1)(pregunta5 -3)(pregunta6 1)(pregunta7 2)(pregunta8 3)(pregunta9 3)(pregunta10 -2)(pregunta11 3)(pregunta12 -2)(pregunta13 3)(pregunta14 -2)(pregunta15 -1)(pregunta16 2)(pregunta17 3)(pregunta18 3)(pregunta19 -1)(pregunta20 -2)(pregunta21 1)(pregunta22 -2)(pregunta23 3)(pregunta24 1)(pregunta25 -3)(pregunta26 -1)(pregunta27 -2)(pregunta28 3)(pregunta29 -1)(pregunta30 2)))

(assert (persona (nombre "Diana Pelaez")(edad 20)(genero F)(pregunta1 -2)(pregunta2 -2)(pregunta3 -1)(pregunta4 1)(pregunta5 -2)(pregunta6 2)(pregunta7 -2)(pregunta8 3)(pregunta9 -3)(pregunta10 3)(pregunta11 -2)(pregunta12 2)(pregunta13 2)(pregunta14 1)(pregunta15 1)(pregunta16 -1)(pregunta17 -1)(pregunta18 1)(pregunta19 -3)(pregunta20 1)(pregunta21 2)(pregunta22 -3)(pregunta23 -2)(pregunta24 -1)(pregunta25 -1)(pregunta26 -2)(pregunta27 2)(pregunta28 2)(pregunta29 -3)(pregunta30 1)))


