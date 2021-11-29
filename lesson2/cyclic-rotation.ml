let rec solution list times =
    match List.rev list with
    | x :: xs when times > 0 -> solution (x :: List.rev xs) (times - 1)
    | _ -> list

