def dna_to_rna(dna):
    cap_dna = dna.upper()
    RNA=""
    for i in cap_dna:
        if i == "T":
            RNA += 'U'
        else:
            RNA += i
    return RNA
print(dna_to_rna('gcut'))