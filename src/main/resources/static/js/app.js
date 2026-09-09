const searchBox = document.getElementById("searchBox");
const cards = document.querySelectorAll(".product-card");
const noResults = document.getElementById("noResults");

searchBox.addEventListener("input", function () {
    const query = this.value.toLowerCase().trim();
    let visible = 0;

    cards.forEach(card => {
        const name = card.dataset.name.toLowerCase();
        const match = name.includes(query);
        card.style.display = match ? "" : "none";
        if (match) visible++;
    });

    noResults.hidden = visible !== 0;
});

function editProduct() {
    alert("Edit functionality is intentionally left as a Docker practice exercise.");
}
