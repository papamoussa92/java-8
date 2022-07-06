List<String> animalsNull = null;

List<String> animalWithNullElements = new ArrayList<String>();
        animalWithNullElements.add(0, null);
        animalWithNullElements.add(1, "Guybrush Threepwood");
        animalWithNullElements.add(2, null);

private static List<String> filterList(List<String> animals) {
        return Optional.ofNullable(animals)
               .orElseGet(Collections::emptyList)
               .stream()
               .filter(Objects::nonNull)
               .collect(Collectors.toList());
    }
