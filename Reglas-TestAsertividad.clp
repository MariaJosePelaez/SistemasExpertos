
(watch all)

(defrule Resultado-Pregunta1

 ?test <-(persona (nombre ?nombre)(pregunta1 ?p1))
       
        => 
        (bind ?suma 0)
            (if 
                (and
                    (>= ?p1 1)
                    (<= ?p1 3)
                )
            then
                    (bind ?suma (- ?suma ?p1))
                    (modify ?test (pregunta1 ?suma ))
                             
            )

        (printout t ?nombre " En la pregunta 1 tiene una puntuacion de : " ?p1 crlf)

            
     
)


(defrule Resultado-Pregunta2

        ?test <-(persona (nombre ?nombre)(pregunta2 ?p2))
       
        => 
        (bind ?suma 0)
            (if 
                (and
                    (>= ?p2 1)
                    (<= ?p2 3)
                )
            then
                    (bind ?suma (- ?suma ?p2))
                    (modify ?test (pregunta2 ?suma ))
                  
            
            )

        (printout t ?nombre " En la pregunta 2 tiene una puntuacion de : " ?p2 crlf)

)

(defrule Resultado-Pregunta4

        ?test <-(persona (nombre ?nombre)(pregunta4 ?p4))
       
        =>
        (bind ?suma 0)
            (if 
                (and
                    (>= ?p4 1)
                    (<= ?p4 3)
                )
            then
                    (bind ?suma (- ?suma ?p4))
                    (modify ?test (pregunta4 ?suma ))
              
            
            )

        (printout t ?nombre " En la pregunta 4 tiene una puntuacion de : " ?p4 crlf)

)


(defrule Resultado-Pregunta5

        ?test <-(persona (nombre ?nombre)(pregunta5 ?p5))
       
        =>
        (bind ?suma 0)
            (if 
                (and
                    (>= ?p5 1)
                    (<= ?p5 3)
                )
            then
                    (bind ?suma (- ?suma ?p5))
                    (modify ?test (pregunta5 ?suma ))
                 
            
            )

        (printout t ?nombre " En la pregunta 5 tiene una puntuacion de : " ?p5 crlf)

)

(defrule Resultado-Pregunta9

        ?test <-(persona (nombre ?nombre)(pregunta9 ?p9))
       
        =>
        (bind ?suma 0)
            (if 
                (and
                    (>= ?p9 1)
                    (<= ?p9 3)
                )
            then
                    (bind ?suma (- ?suma ?p9))
                    (modify ?test (pregunta9 ?suma ))
                
            
            )

        (printout t ?nombre " En la pregunta 9 tiene una puntuacion de : " ?p9 crlf)

)


(defrule Resultado-Pregunta11

        ?test <-(persona (nombre ?nombre)(pregunta11 ?p11))
       
        =>
        (bind ?suma 0)
            (if 
                (and
                    (>= ?p11 1)
                    (<= ?p11 3)
                )
            then
                    (bind ?suma (- ?suma ?p11))
                    (modify ?test (pregunta11 ?suma ))
                   
            
            )

        (printout t ?nombre " En la pregunta 11 tiene una puntuacion de : " ?p11 crlf)

)

(defrule Resultado-Pregunta12

        ?test <-(persona (nombre ?nombre)(pregunta12 ?p12))
       
        =>
        (bind ?suma 0)
            (if 
                (and
                    (>= ?p12 1)
                    (<= ?p12 3)
                )
            then
                    (bind ?suma (- ?suma ?p12))
                    (modify ?test (pregunta12 ?suma ))
             
            
            )

        (printout t ?nombre " En la pregunta 12 tiene una puntuacion de : " ?p12 crlf)

)

(defrule Resultado-Pregunta13

        ?test <-(persona (nombre ?nombre)(pregunta13 ?p13))
       
        =>
        (bind ?suma 0)
            (if 
                (and
                    (>= ?p13 1)
                    (<= ?p13 3)
                )
            then
                    (bind ?suma (- ?suma ?p13))
                    (modify ?test (pregunta13 ?suma ))
                
            
            )

        (printout t ?nombre " En la pregunta 13 tiene una puntuacion de : " ?p13 crlf)

)

(defrule Resultado-Pregunta14

        ?test <-(persona (nombre ?nombre)(pregunta14 ?p14))
       
        =>
        (bind ?suma 0)
            (if 
                (and
                    (>= ?p14 1)
                    (<= ?p14 3)
                )
            then
                    (bind ?suma (- ?suma ?p14))
                    (modify ?test (pregunta14 ?suma ))
                 
            
            )

        (printout t ?nombre " En la pregunta 14 tiene una puntuacion de : " ?p14 crlf)

)

(defrule Resultado-Pregunta15

        ?test <-(persona (nombre ?nombre)(pregunta15 ?p15))
       
        =>
        (bind ?suma 0)
            (if 
                (and
                    (>= ?p15 1)
                    (<= ?p15 3)
                )
            then
                    (bind ?suma (- ?suma ?p15))
                    (modify ?test (pregunta15 ?suma ))
                   
            
            )

        (printout t ?nombre " En la pregunta 15 tiene una puntuacion de : " ?p15 crlf)

)

(defrule Resultado-Pregunta16

        ?test <-(persona (nombre ?nombre)(pregunta16 ?p16))
       
        =>
        (bind ?suma 0)
            (if 
                (and
                    (>= ?p16 1)
                    (<= ?p16 3)
                )
            then
                    (bind ?suma (- ?suma ?p16))
                    (modify ?test (pregunta16 ?suma ))
                    
            
            )

        (printout t ?nombre " En la pregunta 16 tiene una puntuacion de : " ?p16 crlf)


)

(defrule Resultado-Pregunta17

        ?test <-(persona (nombre ?nombre)(pregunta17 ?p17))
       
        =>
        (bind ?suma 0)
            (if 
                (and
                    (>= ?p17 1)
                    (<= ?p17 3)
                )
            then
                    (bind ?suma (- ?suma ?p17))
                    (modify ?test (pregunta17 ?suma ))
                   
            
            )

        (printout t ?nombre " En la pregunta 17 tiene una puntuacion de : " ?p17 crlf)

)

(defrule Resultado-Pregunta19

        ?test <-(persona (nombre ?nombre)(pregunta19 ?p19))
       
        =>
        (bind ?suma 0)
            (if 
                (and
                    (>= ?p19 1)
                    (<= ?p19 3)
                )
            then
                    (bind ?suma (- ?suma ?p19))
                    (modify ?test (pregunta19 ?suma ))
                  
            
            )

        (printout t ?nombre " En la pregunta 19 tiene una puntuacion de : " ?p19 crlf)

)

(defrule Resultado-Pregunta23

        ?test <-(persona (nombre ?nombre)(pregunta23 ?p23))
       
        =>
        (bind ?suma 0)
            (if 
                (and
                    (>= ?p23 1)
                    (<= ?p23 3)
                )
            then
                    (bind ?suma (- ?suma ?p23))
                    (modify ?test (pregunta23 ?suma ))
                   
            
            )

        (printout t ?nombre " En la pregunta 23 tiene una puntuacion de : " ?p23 crlf)

)

(defrule Resultado-Pregunta24

        ?test <-(persona (nombre ?nombre)(pregunta24 ?p24))
       
        =>
        (bind ?suma 0)
            (if 
                (and
                    (>= ?p24 1)
                    (<= ?p24 3)
                )
            then
                    (bind ?suma (- ?suma ?p24))
                    (modify ?test (pregunta24 ?suma ))
               
            
            )

        (printout t ?nombre " En la pregunta 24 tiene una puntuacion de : " ?p24 crlf)

)

(defrule Resultado-Pregunta26

        ?test <-(persona (nombre ?nombre)(pregunta26 ?p26))
       
        =>
        (bind ?suma 0)
            (if 
                (and
                    (>= ?p26 1)
                    (<= ?p26 3)
                )
            then
                    (bind ?suma (- ?suma ?p26))
                    (modify ?test (pregunta26 ?suma ))
                    
            
            )

        (printout t ?nombre " En la pregunta 26 tiene una puntuacion de : " ?p26 crlf)

)

(defrule Resultado-Pregunta30

        ?test <-(persona (nombre ?nombre)(pregunta30 ?p30))
       
        =>
        (bind ?suma 0)
            (if 
                (and
                    (>= ?p30 1)
                    (<= ?p30 3)
                )
            then
                    (bind ?suma (- ?suma ?p30))
                    (modify ?test (pregunta30 ?suma ))
                   
            
            )

        (printout t ?nombre " En la pregunta 30 tiene una puntuacion de : " ?p30 crlf)

)


(defrule ResultadoPuntuacion

    ?test <-(persona (nombre ?nombre)
    (pregunta1 ?p1)(pregunta2 ?p2)
    (pregunta3 ?p3)(pregunta4 ?p4)
    (pregunta5 ?p5)(pregunta6 ?p6)
    (pregunta7 ?p7)(pregunta8 ?p8)
    (pregunta9 ?p9)(pregunta10 ?p10)
    (pregunta11 ?p11)(pregunta12 ?p12)
    (pregunta13 ?p13)(pregunta14 ?p14)
    (pregunta15 ?p15)(pregunta16 ?p16)
    (pregunta17 ?p17)(pregunta18 ?p18)
    (pregunta19 ?p19)(pregunta20 ?p20)
    (pregunta21 ?p21)(pregunta22 ?p22)
    (pregunta23 ?p23)(pregunta24 ?p24)
    (pregunta25 ?p25)(pregunta26 ?p26)
    (pregunta27 ?p27)(pregunta28 ?p28)
    (pregunta29 ?p29)(pregunta30 ?p30)
    (puntuacion ?puntuacion)
    (nivel_asertividad ?nivel))
    
=>

    (bind ?suma 0)
                     (bind ?suma (+ ?suma ?p1))
            
                     (bind ?suma (+ ?suma ?p2))
            
                     (bind ?suma (+ ?suma ?p3))
            
                     (bind ?suma (+ ?suma ?p4))
            
                     (bind ?suma (+ ?suma ?p5))
            
                     (bind ?suma (+ ?suma ?p6))
            
                     (bind ?suma (+ ?suma ?p7))
            
                     (bind ?suma (+ ?suma ?p8))
   
                     (bind ?suma (+ ?suma ?p9))
            
                     (bind ?suma (+ ?suma ?p10))

                     (bind ?suma (+ ?suma ?p11))

                     (bind ?suma (+ ?suma ?p12))

                     (bind ?suma (+ ?suma ?p13))

                     (bind ?suma (+ ?suma ?p14))

                     (bind ?suma (+ ?suma ?p15))

                     (bind ?suma (+ ?suma ?p16))

                     (bind ?suma (+ ?suma ?p17))

                     (bind ?suma (+ ?suma ?p18))

                     (bind ?suma (+ ?suma ?p19))

                     (bind ?suma (+ ?suma ?p20))

                     (bind ?suma (+ ?suma ?p21))

                     (bind ?suma (+ ?suma ?p22))

                     (bind ?suma (+ ?suma ?p23))

                     (bind ?suma (+ ?suma ?p24))

                     (bind ?suma (+ ?suma ?p25))

                     (bind ?suma (+ ?suma ?p26))

                     (bind ?suma (+ ?suma ?p27))

                     (bind ?suma (+ ?suma ?p28))

                     (bind ?suma (+ ?suma ?p29))

                     (bind ?suma (+ ?suma ?p30))
               

        (modify ?test (puntuacion ?suma))
        (printout t ?nombre " tu tienes una puntuacion de: " ?suma crlf)

        (if 
            (and
                    (> ?puntuacion 0)
                    (<= ?puntuacion 90)
            )
            then
                    (modify ?test (nivel_asertividad "Muy Buena Asertividad"))
                    (printout t ?nombre " Muy buena asertividad: resuelve armoniosamente sus relaciones con las personas, defiende sus derechos sin agredir y busca la solución más adecuada para todo."  crlf)
                    (halt)
            
           )

            if 
            (and
                    (>= ?puntuacion -90)
                    (<= ?puntuacion -1)
            )
            then
                      (modify ?test (nivel_asertividad "Poca Asertividad"))
                      (printout t ?nombre " Poca Asertividad: rara vez maneja armoniosamente sus relaciones, seria recomendable desarrollar más habillidades asertivas. Resolver conflictos de la manera mas armoniosa y diplomatica posible."  crlf)
                      (halt)
           )

             (if 
                    (== ?puntuacion 0)
            )
            then
                     (modify ?test (nivel_asertividad "Asertividad Aceptable"))
                     (printout t ?nombre "Asertividad Aceptable: " aunque resuelve algunas situaciones positivamente, es importante considerar formas mas armoniosas para resolver las relaciones con las personas que le rodean.  crlf)
                     (halt)
            
           )
)

