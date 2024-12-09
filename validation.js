document.addEventListener("DOMContentLoaded", () => {
    const forms = document.querySelectorAll("form");

    forms.forEach((form) => {
        form.addEventListener("submit", (event) => {
            event.preventDefault();
            let valid = true;

            form.querySelectorAll("input").forEach((input) => {
                if (!input.value) {
                    input.classList.add("is-invalid");
                    valid = false;
                } else {
                    input.classList.remove("is-invalid");
                }
            });

            const password = form.querySelector("#password");
            const confirmPassword = form.querySelector("#confirmPassword");

            if (password && confirmPassword && password.value !== confirmPassword.value) {
                confirmPassword.classList.add("is-invalid");
                valid = false;
            }

            if (valid) {
                alert("Form submitted successfully!");
            }
        });
    });
});
