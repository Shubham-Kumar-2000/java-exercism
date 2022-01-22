class RnaTranscription {

    String transcribe(String dnaStrand) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String rnaStrand = dnaStrand
                            .replaceAll("A", "U")
                            .replaceAll("T", "A")
                            .replaceAll("C", "g")
                            .replaceAll("G", "C")
                            .replaceAll("g", "G");
        return rnaStrand;
    }

}
