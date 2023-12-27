$(document).ready(function () {
    function validateDonGia() {

        let donGia = $("#donGia").val();
        let regexDonGia = /^\d*$/

        if (donGia === "") {
            $("#donGia").addClass("is-invalid")
            $("#errorDonGia").text("* Không được để trống!")
            return false;
        } else if (parseInt(donGia) < 0) {
            $("#donGia").addClass("is-invalid")
            $("#errorDonGia").text("* Không được nhập số nguyên âm!")
            return false;
        } else if (!regexDonGia.test(donGia)) {
            $("#donGia").addClass("is-invalid")
            $("#errorDonGia").text("* Chỉ nhập số!")
            return false;
        }
        $("#donGia").removeClass("is-invalid")
        $("#errorDonGia").text("")
        return true;
    }

    function validateMaDv() {
        let maDv = $("#maDV").val();
        let regexMaDv = /^DV\d{3}$/

        if (maDv === "") {
            $("#maDV").addClass("is-invalid")
            $("#errorMaDv").text("* Không được để trống!")
            return false;
        } else if (!regexMaDv.test(maDv)) {
            $("#maDV").addClass("is-invalid")
            $("#errorMaDv").text("* Phải đúng định dạng: DVxxx (x là số)!")
            return false;
        }

        $("#maDV").removeClass("is-invalid")
        $("#errorMaDv").text("")
        return true;

    }

    $(document).on("submit", "#formDv", function (event) {
        event.preventDefault();

        if (!validateDonGia() | !validateMaDv()) {
            return;
        }

        this.submit();
    });
})