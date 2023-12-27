$(document).ready(function () {
    function validateSdt() {
        let soDienThoai = $("#soDienThoai").val();
        let regexSdt = /^(090|091|\(84\)\+90|\(84\)\+91)\d{7}$/

        if (soDienThoai === "") {
            $("#soDienThoai").addClass("is-invalid")
            $("#errorSdt").text("* Không được để trống!");
            return false;
        } else if (!regexSdt.test(soDienThoai)) {
            $("#soDienThoai").addClass("is-invalid")
            $("#errorSdt").text("* Phải đúng định dạng 090xxxxxxx hoặc 091xxxxxxx hoặc (84)+90xxxxxxx hoặc (84)+91xxxxxxx!");
            return false;
        }
        $("#errorSdt").text("");
        $("#soDienThoai").removeClass("is-invalid")
        return true;
    }

    function validateEmail() {

        let email = $("#email").val();
        let regexEmail = /^\w*@gmail.com$/

        if (email === "") {
            $("#email").addClass("is-invalid");
            $("#errorEmail").text("* Không được để trống!");
            return false;
        } else if (!regexEmail.test(email)) {
            $("#email").addClass("is-invalid");
            $("#errorEmail").text("* Email phải đúng định dạng (abc123@gmail.com)!");
            return false;
        }
        $("#email").removeClass("is-invalid");
        $("#errorEmail").text("");
        return true;
    }

    function validateMaKh() {
        let maKh = $("#maKh").val();
        let regexMaKh = /^KH\d{5}$/

        if (maKh === "") {
            $("#maKh").addClass("is-invalid")
            $("#errorMaKh").text("* Không được để trống!")
            return false;
        } else if (!regexMaKh.test(maKh)) {
            $("#maKh").addClass("is-invalid")
            $("#errorMaKh").text("* Phải đúng định dạng: KHxxxxx (x là số)!")
            return false;
        }

        $("#maKh").removeClass("is-invalid")
        $("#errorMaKh").text("")
        return true;
    }

    $(document).on("submit", "#formKh", function (event) {
        // Ngăn chặn submit mặc định của form
        event.preventDefault();

        if (!validateEmail() | !validateSdt() | !validateMaKh()) {
            console.log("abc")
            return;
        }
        this.submit();
    });
})