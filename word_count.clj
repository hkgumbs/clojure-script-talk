(println
  (count
    (re-seq #"Tar-Baby" (slurp "sample.txt"))))
